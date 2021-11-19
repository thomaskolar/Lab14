
package com.mycompany.lab14;


public class Materials {
    private final String hardness;
    private final String weight;
    private final String visibility;
    private final String RigidBendyElastic;
    private final boolean breathable;
    private final boolean waterproof;
    private final boolean absorbent;
    private final boolean windproof;
    private final boolean moistureResistant;
    private final boolean shiny;
    private final boolean antibacterial;
    private final boolean heatResistant;
    private final boolean coldResistant;
    private final boolean acidResistant;
    private final boolean alcoholResistant;
    private final boolean alkaliResistant;
    private final boolean mineraloilResistant;
    private final boolean recyclable;

    public Materials(Builder builder) {
        this.hardness = builder.hardness;
        this.weight = builder.weight;
        this.visibility = builder.visibility;
        this.RigidBendyElastic = builder.RigidBendyElastic;
        this.breathable = builder.breathable;
        this.waterproof = builder.waterproof;
        this.absorbent = builder.absorbent;
        this.windproof = builder.windproof;
        this.moistureResistant = builder.moistureResistant;
        this.shiny = builder.shiny;
        this.antibacterial = builder.antibacterial;
        this.heatResistant = builder.heatResistant;
        this.coldResistant = builder.coldResistant;
        this.acidResistant = builder.acidResistant;
        this.alcoholResistant = builder.alcoholResistant;
        this.alkaliResistant = builder.alkaliResistant;
        this.mineraloilResistant = builder.mineraloilResistant;
        this.recyclable = builder.recyclable;
    }

    public String getHardness() {
        return hardness;
    }

    public String getWeight() {
        return weight;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getRigidBendyElastic() {
        return RigidBendyElastic;
    }

    public boolean isBreathable() {
        return breathable;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public boolean isAbsorbent() {
        return absorbent;
    }

    public boolean isWindproof() {
        return windproof;
    }

    public boolean isMoistureResistant() {
        return moistureResistant;
    }

    public boolean isShiny() {
        return shiny;
    }

    public boolean isAntibacterial() {
        return antibacterial;
    }

    public boolean isHeatResistant() {
        return heatResistant;
    }

    public boolean isColdResistant() {
        return coldResistant;
    }

    public boolean isAcidResistant() {
        return acidResistant;
    }

    public boolean isAlcoholResistant() {
        return alcoholResistant;
    }

    public boolean isAlkaliResistant() {
        return alkaliResistant;
    }

    public boolean isMineraloilResistant() {
        return mineraloilResistant;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    @Override
    public String toString() {
        return "Materials{" + "hardness=" + hardness + ", weight=" + weight + ", visibility=" + visibility + ", RigidBendyElastic=" + RigidBendyElastic + ", breathable=" + breathable + ", waterproof=" + waterproof + ", absorbent=" + absorbent + ", windproof=" + windproof + ", moistureResistant=" + moistureResistant + ", shiny=" + shiny + ", antibacterial=" + antibacterial + ", heatResistant=" + heatResistant + ", coldResistant=" + coldResistant + ", acidResistant=" + acidResistant + ", alcoholResistant=" + alcoholResistant + ", alkaliResistant=" + alkaliResistant + ", mineraloilResistant=" + mineraloilResistant + ", recyclable=" + recyclable + '}';
    }

    public static class Builder{
        private String hardness;
        private String weight;
        private String visibility;
        private String RigidBendyElastic;
        private boolean breathable;
        private boolean waterproof;
        private boolean absorbent;
        private boolean windproof;
        private boolean moistureResistant;
        private boolean shiny;
        private boolean antibacterial;
        private boolean heatResistant;
        private boolean coldResistant;
        private boolean acidResistant;
        private boolean alcoholResistant;
        private boolean alkaliResistant;
        private boolean mineraloilResistant;
        private boolean recyclable;

        public Builder(String hardness, String weight, String visibility, String RigidBendyElastic) {
            this.hardness = hardness;
            this.weight = weight;
            this.visibility = visibility;
            this.RigidBendyElastic = RigidBendyElastic;
        }

        public Builder breathable(boolean bool) {
            breathable = bool;
            return this;
        }
        
        public Builder waterproof(boolean bool) {
            waterproof = bool;
            return this;
        }
        
        public Builder absorbent(boolean bool) {
            absorbent = bool;
            return this;
        }
        
        public Builder windproof(boolean bool) {
            windproof = bool;
            return this;
        }
        
        public Builder moistureResistant(boolean bool) {
            moistureResistant = bool;
            return this;
        }
        
        public Builder shiny(boolean bool) {
            shiny = bool;
            return this;
        }
        
        public Builder antibacterial(boolean bool) {
            antibacterial = bool;
            return this;
        }
        
        public Builder heatResistant(boolean bool) {
            heatResistant = bool;
            return this;
        }
        
        public Builder coldResistant(boolean bool) {
            coldResistant = bool;
            return this;
        }
        
        public Builder acidResistant(boolean bool) {
            acidResistant = bool;
            return this;
        }
        
        public Builder alcoholResistant(boolean bool) {
            alcoholResistant = bool;
            return this;
        }
        
        public Builder alkaliResistant(boolean bool) {
            alkaliResistant = bool;
            return this;
        }
        
        public Builder mineraloilResistant(boolean bool) {
            mineraloilResistant = bool;
            return this;
        }
        
        public Builder recyclable(boolean bool) {
            recyclable = bool;
            return this;
        }
        
        public Materials build(){
            return new Materials(this);
        }
        
        
    }

    
    
    
    
    
    
    
    
    
}
