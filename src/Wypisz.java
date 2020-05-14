public class Wypisz {
    //przyjmuje liczbe i wypisuje ładnie
    public static void wypiszWynik(double wynik) {

        System.out.println("Wynik zaimplementowanego działania to: "+wynik);
        System.out.println("--------------------------------------");

    }

    //powitanie
    public static void wypiszPowitanie(String dodatkowaWiadomosc) {

        System.out.println("Witaj! Jestem Kalkulator PRM2T. ");
        System.out.println("Projekt stworzony przez: Jan Lewandowski, Jan Adamski, Tomasz Kapuściński");
        System.out.println("Wykonuję obliczenia + - / * ");
        System.out.println("Możesz wpisać dowolne działanie opierające się o te znaki w konsoli lub pliku txt. ");
        System.out.println(dodatkowaWiadomosc);
        System.out.println("--------------------------------------");

    }

    //pozegnanie
    public static void wypiszPozegnanie(String dodatkowaWiadomosc) {


        System.out.println("Dziękuję za skorzystanie z usług kalkulatora!");
        System.out.println(dodatkowaWiadomosc);
        System.out.println("--------------------------------------");

    }

    //blad
    public static void wypiszBlad(String bladInfo) {

        System.out.println("Ups... Niestety wykryto błąd: "+bladInfo);
        System.out.println("--------------------------------------");

    }
    public static void main(String[] args) {
        String string = "błąd: dzielenie przez 0 \n" +
                        "błąd: nie wykonuję potęgowania \n" +
                        "błąd: aaa";
        wypiszPowitanie("Wersja 1.0");
        wypiszBlad("podales zle dzialanie");
        wypiszWynik(19);
        wypiszPozegnanie(string);
    }
}
