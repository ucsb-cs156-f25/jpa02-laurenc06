package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

     @Test
     public void addMember_adds_members() {
        team.addMember("Lauren");
        team.addMember("Karen");
        assertEquals(List.of("Lauren", "Karen"), team.getMembers());
     }

     // T,T
     @Test
    public void equals_same_name_and_members() {
        Team benchmark = new Team();
        benchmark.setName("f25-09");
        benchmark.addMember("LAUREN GRACE");
        benchmark.addMember("SAMPRITA");
        benchmark.addMember("DAVID MARIO");
        benchmark.addMember("DENNIS");
        benchmark.addMember("VIKTOR STANISLAVOV");
        benchmark.addMember("ONUR");

        Team tester = new Team();
        tester.setName("f25-09");
        tester.addMember("LAUREN GRACE");
        tester.addMember("SAMPRITA");
        tester.addMember("DAVID MARIO");
        tester.addMember("DENNIS");
        tester.addMember("VIKTOR STANISLAVOV");
        tester.addMember("ONUR");

        assertTrue(benchmark.equals(tester));
        assertTrue(tester.equals(benchmark));
        assertEquals(benchmark.hashCode(), tester.hashCode());
    }

    // T,F
     @Test
    public void equals_same_name_but_different_members() {
        Team benchmark = new Team();
        benchmark.setName("f25-09");
        benchmark.addMember("KAREN GLORIA");
        benchmark.addMember("SAMPRITA");
        benchmark.addMember("DAVID");
        benchmark.addMember("TENNIS");
        benchmark.addMember("VIKTOR MINCHEV");
        benchmark.addMember("ONUR");

        Team tester = new Team();
        tester.setName("f25-09");
        tester.addMember("LAUREN GRACE");
        tester.addMember("SAMPRITA");
        tester.addMember("DAVID MARIO");
        tester.addMember("DENNIS");
        tester.addMember("VIKTOR STANISLAVOV");
        tester.addMember("ONUR");

        assertFalse(benchmark.equals(tester));
        assertFalse(tester.equals(benchmark));
    }

    // F, T
     @Test
    public void equals_different_name_but_same_members() {
        Team benchmark = new Team();
        benchmark.setName("f25-11");
        benchmark.addMember("LAUREN GRACE");
        benchmark.addMember("SAMPRITA");
        benchmark.addMember("DAVID MARIO");
        benchmark.addMember("DENNIS");
        benchmark.addMember("VIKTOR STANISLAVOV");
        benchmark.addMember("ONUR");

        Team tester = new Team();
        tester.setName("f25-09");
        tester.addMember("LAUREN GRACE");
        tester.addMember("SAMPRITA");
        tester.addMember("DAVID MARIO");
        tester.addMember("DENNIS");
        tester.addMember("VIKTOR STANISLAVOV");
        tester.addMember("ONUR");

        assertFalse(benchmark.equals(tester));
        assertFalse(tester.equals(benchmark));
    }

    // F,F
    // T,T
     @Test
    public void equals_different_name_and_members() {
        Team benchmark = new Team();
        benchmark.setName("f25");
        benchmark.addMember("KAREN");
        benchmark.addMember("SAMPRITA");
        benchmark.addMember("DAVID");
        benchmark.addMember("TENNIS");
        benchmark.addMember("VIKTOR");
        benchmark.addMember("ONUR");

        Team tester = new Team();
        tester.setName("f25-09");
        tester.addMember("LAUREN GRACE");
        tester.addMember("SAMPRITA");
        tester.addMember("DAVID MARIO");
        tester.addMember("DENNIS");
        tester.addMember("VIKTOR STANISLAVOV");
        tester.addMember("ONUR");

        assertFalse(benchmark.equals(tester));
    }

    @Test
    public void hashCodeTester() {
        // do
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)


}
