package dramaplays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import dramaplays.*;

public class FactorPrinterTest {

    @Test
    public void tragedy_testing() {
        Performance performance = new Performance("hamlet", 40);

        List<Performance> performances = new ArrayList<> ();
        performances.add(performance);
        Invoice invoice = new Invoice("John Doe", performances);

        Play play = new Play("Hamlet", "tragedy");

        Map<String, Play> plays = new HashMap<>();
        plays.put("hamlet", play);

        FactorPrinter printer = new FactorPrinter();
        String result = printer.print(invoice, plays);

        String expected = "Factor for John Doe\n"
                        + "  Hamlet: $500.00 (40 seats)\n"
                        + "Amount owed is $500.00\n"
                        + "You earned 10 credits\n";

        assertEquals(expected, result);
    }

    @Test
    public void comedy_testing() {
        Performance performance = new Performance("as-like", 25);        
        List<Performance> performances = new ArrayList<> ();

        performances.add(performance);

        Invoice invoice = new Invoice("Jane Smith", performances);

        Play play = new Play("As You Like It", "comedy");

        Map<String, Play> plays = new HashMap<>();
        plays.put("as-like", play);

        FactorPrinter printer = new FactorPrinter();
        String result = printer.print(invoice, plays);

        String expected = "Factor for Jane Smith\n"
                        + "  As You Like It: $500.00 (25 seats)\n"
                        + "Amount owed is $500.00\n"
                        + "You earned 5 credits\n";

        assertEquals(expected, result);
    }

    @Test
    public void test_mulitple_performances() {
        List<Performance> performances = new ArrayList<> (); 
        Performance perf1 = new Performance("Othello", 40);
        Performance perf2 = new Performance("Twelfth Night", 35);

        performances.add(perf1);
        performances.add(perf2);

        Invoice invoice = new Invoice("Alice Johnson", performances);

        Play play1 = new Play("Othello", "tragedy");
        Play play2 = new Play("Twelfth Night", "comedy");

        Map<String, Play> plays = new HashMap<>();
        plays.put("Othello", play1);
        plays.put("Twelfth Night", play2);

        FactorPrinter printer = new FactorPrinter();
        String result = printer.print(invoice, plays);

        String expected = "Factor for Alice Johnson\n"
                        + "  Othello: $500.00 (40 seats)\n"
                        + "  Twelfth Night: $580.00 (35 seats)\n"
                        + "Amount owed is $1,080.00\n"
                        + "You earned 22 credits\n";

        assertEquals(expected, result);
    }

    @Test
    public void test_unkonwn_play() {
        Performance performance = new Performance("unknown-play", 20);
        List<Performance> performances = new ArrayList<> ();
        performances.add(performance);

        Invoice invoice = new Invoice("Bob Brown", performances);

        Play play = new Play("Unknown Play", "unknown");

        Map<String, Play> plays = new HashMap<>();
        plays.put("unknown-play", play);

        FactorPrinter printer = new FactorPrinter();
        Error exception = assertThrows(Error.class, () -> {
            printer.print(invoice, plays);
        });

        assertEquals("unknown type: ${play.type}", exception.getMessage());
    }

    @Test
    public void test_credits() {
        Performance perf = new Performance("comedy-play", 55);
        List<Performance> performances = new ArrayList<> ();
        performances.add(perf);
        Invoice invoice = new Invoice("Clara White", performances);

        Play play = new Play("Comedy Play", "comedy");

        Map<String, Play> plays = new HashMap<>();
        plays.put("comedy-play", play);

        FactorPrinter printer = new FactorPrinter();
        String result = printer.print(invoice, plays);

        String expected = "Factor for Clara White\n"
                        + "  Comedy Play: $740.00 (55 seats)\n"
                        + "Amount owed is $740.00\n"
                        + "You earned 36 credits\n";

        assertEquals(expected, result);
    }
}
