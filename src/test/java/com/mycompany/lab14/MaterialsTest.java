/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yanke
 */
public class MaterialsTest {
    
    
    @Test
    public void testMaterial1() {
        String expResult = "Materials{" + "hardness=" + "Hard" + ", weight=" + "light-weight" + ", visibility=" + "opaque" + ", RigidBendyElastic=" + "Rigid" + 
                ", breathable=" + false + ", waterproof=" + false + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + false + 
                ", shiny=" + false + ", antibacterial=" + false + ", heatResistant=" + false + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + false + ", recyclable=" + true + '}';
        Materials paper = new Materials.Builder("Hard","light-weight","opaque","Rigid")
        .recyclable(true)
        .build();
        String result = paper.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaterial2() {
        String expResult = "Materials{" + "hardness=" + "Hard" + ", weight=" + "heavy" + ", visibility=" + "opaque" + ", RigidBendyElastic=" + "Rigid" + 
                ", breathable=" + false + ", waterproof=" + false + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + false + 
                ", shiny=" + true + ", antibacterial=" + false + ", heatResistant=" + true + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + true + ", recyclable=" + true + '}';
        Materials steel = new Materials.Builder("Hard","heavy","opaque","Rigid")
        .recyclable(true)
        .heatResistant(true)
        .mineraloilResistant(true)
        .shiny(true)
        .build();
        String result = steel.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaterial3() {
        String expResult = "Materials{" + "hardness=" + "Hard" + ", weight=" + "heavy" + ", visibility=" + "transparent" + ", RigidBendyElastic=" + "Rigid" + 
                ", breathable=" + false + ", waterproof=" + true + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + true + 
                ", shiny=" + true + ", antibacterial=" + false + ", heatResistant=" + false + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + false + ", recyclable=" + true + '}';
        Materials glass = new Materials.Builder("Hard","heavy","transparent","Rigid")
        .recyclable(true)
        .waterproof(true)
        .moistureResistant(true)
        .shiny(true)
        .build();
        String result = glass.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaterial4() {
        String expResult = "Materials{" + "hardness=" + "soft" + ", weight=" + "light-weight" + ", visibility=" + "opaque" + ", RigidBendyElastic=" + "Bendy" + 
                ", breathable=" + false + ", waterproof=" + true + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + true + 
                ", shiny=" + false + ", antibacterial=" + false + ", heatResistant=" + false + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + false + ", recyclable=" + true + '}';
        Materials silicone = new Materials.Builder("soft","light-weight","opaque","Bendy")
        .recyclable(true)
        .waterproof(true)
        .moistureResistant(true)
        .build();
        String result = silicone.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaterial5() {
        String expResult = "Materials{" + "hardness=" + "Hard" + ", weight=" + "light-weight" + ", visibility=" + "transparent" + ", RigidBendyElastic=" + "Rigid" + 
                ", breathable=" + false + ", waterproof=" + true + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + true + 
                ", shiny=" + false + ", antibacterial=" + false + ", heatResistant=" + false + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + true + ", recyclable=" + true + '}';
        Materials bottle = new Materials.Builder("Hard","light-weight","transparent","Rigid")
        .recyclable(true)
        .waterproof(true)
        .mineraloilResistant(true)
        .moistureResistant(true)
        .build();
        String result = bottle.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaterial6() {
        String expResult = "Materials{" + "hardness=" + "Hard" + ", weight=" + "light-weight" + ", visibility=" + "opaque" + ", RigidBendyElastic=" + "Rigid" + 
                ", breathable=" + false + ", waterproof=" + true + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + true + 
                ", shiny=" + true + ", antibacterial=" + false + ", heatResistant=" + false + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + true + ", recyclable=" + true + '}';
        Materials can = new Materials.Builder("Hard","light-weight","opaque","Rigid")
        .recyclable(true)
        .absorbent(false)
        .mineraloilResistant(true)
        .moistureResistant(true)
        .shiny(true)
        .waterproof(true)
        .build();
        String result = can.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMaterial7() {
        String expResult = "Materials{" + "hardness=" + "Hard" + ", weight=" + "light-weight" + ", visibility=" + "opaque" + ", RigidBendyElastic=" + "Rigid" + 
                ", breathable=" + false + ", waterproof=" + false + ", absorbent=" + false + ", windproof=" + false + ", moistureResistant=" + false + 
                ", shiny=" + false + ", antibacterial=" + false + ", heatResistant=" + false + ", coldResistant=" + false + ", acidResistant=" + false + 
                ", alcoholResistant=" + false + ", alkaliResistant=" + false + ", mineraloilResistant=" + false + ", recyclable=" + true + '}';
        Materials circuit = new Materials.Builder("Hard","light-weight","opaque","Rigid")
        .recyclable(true)
        .absorbent(false)
        .acidResistant(false)
        .breathable(false)
        .build();
        String result = circuit.toString();
        assertEquals(expResult, result);
    }
    
}
    
