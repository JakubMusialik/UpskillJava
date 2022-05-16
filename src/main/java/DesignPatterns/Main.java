package DesignPatterns;

import DesignPatterns.AbstractFactory.BritishFactory;
import DesignPatterns.AbstractFactory.Cars.BMWModel;
import DesignPatterns.AbstractFactory.Cars.Car;
import DesignPatterns.AbstractFactory.Cars.TeslaModel;
import DesignPatterns.AbstractFactory.EuropeanFactory;
import DesignPatterns.Adapter.API.LibraryAPIImpl_v2;
import DesignPatterns.Adapter.API.LibraryAPI_v2;
import DesignPatterns.Adapter.APIAdapter;
import DesignPatterns.Adapter.BookConnector;
import DesignPatterns.Adapter.User;
import DesignPatterns.Builder.Flight;
import DesignPatterns.ChainOfResponsility.Children.*;
import DesignPatterns.ChainOfResponsility.MotherRequest;
import DesignPatterns.Command.Commands.PlayFirstTrack;
import DesignPatterns.Command.Commands.PlayNextTrack;
import DesignPatterns.Command.Commands.PlayRandomTrack;
import DesignPatterns.Command.MusicPlayer;
import DesignPatterns.Command.MusicPlayerRemote;
import DesignPatterns.Decorator.*;
import DesignPatterns.Facade.AtmMachineFacade;
import DesignPatterns.Factory.MealFactory;
import DesignPatterns.Factory.MealType;
import DesignPatterns.Factory.Meals.Meal;
import DesignPatterns.Flyweight.*;
import DesignPatterns.Memento.OperatingSystem;
import DesignPatterns.Memento.OperatingSystemCaretaker;
import DesignPatterns.Observer.Notifications.InternetNews;
import DesignPatterns.Observer.Notifications.TvNews;
import DesignPatterns.Observer.WeatherForecast;
import DesignPatterns.Singleton.GuessGame;
import DesignPatterns.State.SlotMachine;
import DesignPatterns.Strategy.PriceCalculator;
import DesignPatterns.Strategy.RegularPrice;
import DesignPatterns.Strategy.SalePrice;
import DesignPatterns.TemplateMethod.MyDay;
import DesignPatterns.TemplateMethod.TypeOfTransport;
import DesignPatterns.TemplateMethod.WeekDay;
import DesignPatterns.Visitor.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //STRATEGY <-- dynamiczne zmiany stanu obiektu, definiuje rodzinę wymiennych algorytmów i kapsułkuje je w postaci klas
        PriceCalculator pc = new PriceCalculator();

        pc.setPriceStrategy(new SalePrice());
        pc.calculate(100, true);
        //dynamiczna zmiana strategii
        pc.setPriceStrategy(new RegularPrice());
        pc.calculate(150, false);
        System.out.println("----------------------");


        //BUILDER  <-- odpowiedzialny za tworzenie obiektów, rozdziela proces tworzenia od obiektu przez co proces
        //budowy może przebiegać w różnych etapach
        //Klasa wewnętrzna
        Flight flight = new Flight.FlightBuilder("Katowice", "Wrocław").price(50).build();
        System.out.println(flight);

        flight.setPrice(150);
        System.out.println(flight);
        System.out.println("----------------------");


        //VISITOR <--oddziela z obiektów dany atrybut, możliwa jest operacja na atrybucie nie wpływając na stan obiektu
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Jan", "Kowalski", true);
        Shipment shipment = new Shipment("PL", "4325452", false);

        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
        System.out.println("----------------------");

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
        System.out.println("----------------------");


        //FACADE <-- ograniczony dostęp do wewnętrznego "systemu" czyt. metod poprzez udostępnienie uproszczonego
        //interfejsu dla użytkownika
        AtmMachineFacade atm = new AtmMachineFacade();

        atm.withdrawMoney();
        System.out.println("----------------------");


        //FACTORY <-- klasa fabryki powinna być w paczce z klasami obiektów w celu dostępu do protected konstruktora,
        //brak możliwości bezpośredniego stworzenia obiektu w mainie
        //dostarcza możliwość tworzenia obiektów jednego typu bez specyfikacji ich konkretnych klas
        MealFactory factory = new MealFactory();

        Meal zupa = factory.createMeal(MealType.ZUPA);
        Meal drugie = factory.createMeal(MealType.DRUGIE_DANIE);
        Meal podwieczorek = factory.createMeal(MealType.PODWIECZOREK);
        System.out.println(zupa);
        System.out.println(drugie);
        System.out.println(podwieczorek);
        System.out.println("----------------------");


        //ABSTRACT FACTORY klasa fabryki powinna być w paczce z klasami obiektów w celu dostępu do protected konstruktora,
        //brak możliwości bezpośredniego stworzenia obiektu w mainie
        //dostarcza możliwość tworzenia obiektów jednego typu bez specyfikacji ich konkretnych klas
        //można tworzyć pochodne fabryki które będą wytwarzać obiekty z innymi atrybutami(Zależne od implementacji)
        BritishFactory bf = new BritishFactory();
        EuropeanFactory ef = new EuropeanFactory();

        Car bmw = ef.buildBMW(BMWModel.X5);
        Car tesla = bf.buildTesla(TeslaModel.MODEL_3);
        System.out.println(bmw.toString());
        System.out.println(tesla.toString());
        System.out.println("----------------------");


        //SINGLETON <-- zapewnia globalny dostęp do obiektu oraz pilnuje by w obrębie aplikacji istniała
        //jedna instancja obiektu

        GuessGame game = GuessGame.getInstance();
        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();
        if (game == anotherGameReference) {
            System.out.println("Właśnie tak działa Singleton");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty sie zgadzaja!");
            }
        }
        System.out.println("----------------------");


        //OBSERVER <--- informuje zainteresowane obiekty o zmianie stanu obserwowanego obiektu
        WeatherForecast wf = new WeatherForecast(10, 1050);
        InternetNews in = new InternetNews();
        TvNews tv = new TvNews();

        wf.registerObserver(in);
        wf.registerObserver(tv);

        wf.notifyObservers();

        wf.updateForecast(15, 1020);

        wf.notifyObservers();
        System.out.println("----------------------");


        //FLYWEIGHT <-- zmniejsza wykorzystanie pamięci poprzez rozbicie dużych obiektów zbudowanych z mniejszych
        //poprzez współdzielenie wspólnych mniejszych elementów
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek", "7", "a");

        ChessPiece whitePawn = new WhitePiece("Biały Pionek", "2", "a");

        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");

        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");

        //ten sam obiekt koloru jest w użyciu
        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
        System.out.println("----------------------");


        //ADAPTER <-- umożliwia współpracę dwóm klasom o niekompatybilnych interfejsach.
        //Adapter przekształca interfejs jednej z klas na interfejs drugiej klasy

        User user = new User("Jan", "Kowalski", "32131212");

        LibraryAPI_v2 libraryAPIv2 = new LibraryAPIImpl_v2();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user, apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");
        System.out.println("----------------------");


        //DECORATOR <-- Pozwala na dodanie nowej funkcji do istniejących klas dynamicznie podczas działania programu.
        // Wzorzec dekoratora polega na opakowaniu oryginalnej klasy w nową klasę „dekorującą”.

        System.out.println("Nowy posiłek: ");
        RiceMeal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        MealDecorator riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        MealDecorator potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();
        System.out.println("----------------------");


        //STATE <--Umożliwia zmianę zachowania obiektu poprzez zmianę jego stanu wewnętrznego.
        // Innymi słowy – uzależnia sposób działania obiektu od stanu w jakim się aktualnie znajduje.

        SlotMachine slotMachine = new SlotMachine();

        slotMachine.insertTheCoin();
        slotMachine.currentState();
        slotMachine.pushTheLever();
        slotMachine.currentState();
        slotMachine.collectTheWinnings();
        slotMachine.currentState();
        System.out.println("----------------------");


        //CHAIN OF RESPONSILITY <-- Wzorzec projektowy, w którym żądanie może być przetwarzane przez różne obiekty,
        // w zależności od jego typu.

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);

        Child jasiek = new Jasiek();
        Child ania = new Ania();
        Child antek = new Antek();

        jasiek.setTallerChild(ania);
        ania.setTallerChild(antek);

        jasiek.processRequest(motherRequest);
        System.out.println("----------------------");


        //TEMPLATE METHOD <-- Zadaniem jest definiowanie metody będącej szkieletem algorytmu.
        // Algorytm ten może być następnie dokładnie definiowany w klasach pochodnych
        //Szkielet nie może zostać nadpisany przez klienta

        WeekDay day = new MyDay();
        day.everyDayIsExaclyTheSame(TypeOfTransport.BIKE);
        System.out.println("----------------------");


        //COMMAND <--Wzorzec traktujący żądanie wykonania określonej czynności jako obiekt,
        // dzięki czemu mogą być one parametryzowane w zależności od rodzaju odbiorcy, a także umieszczane w kolejkach

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        System.out.println("----------------------");


        //MEMENTO <--Zapamiętanie i udostępnienie na zewnątrz wewnętrznego stanu obiektu bez naruszania hermetyzacji.
        //Umożliwia to przywracanie zapamiętanego stanu obiektu.

        try {
            OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
            OperatingSystem operatingSystem = new OperatingSystem();

            operatingSystem.createBackup();
            Thread.sleep(3000);

            operatingSystem.createBackup();
            Thread.sleep(3000);

            operatingSystemCaretaker.addMemento(operatingSystem.save());

            operatingSystem.createBackup();
            Thread.sleep(3000);

            operatingSystem.createBackup();
            Thread.sleep(3000);

            operatingSystem.load(operatingSystemCaretaker.getMemento());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------");
    }
}