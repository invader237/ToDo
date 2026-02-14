package org.example.tache;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.internal.matchers.Equals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TacheTest {

    /*
    @Mock
    private Tache tache;
     */

    @Test
    void setDoneStatus() {
        Tache tache = new Tache("Tache de test");
        tache.setDoneStatus();
        assertTrue(tache.getDoneStatus());
    }

    @Test
    void setDescription() {
        Tache tache = new Tache("d1");
        tache.setDescription("d2");
        assertEquals("d2", tache.getDescription());
    }

    @Test
    void testToString() {
        Tache tache = new Tache("Affichage");
        assertEquals("Affichage - Done : false", tache.toString());
    }
}
