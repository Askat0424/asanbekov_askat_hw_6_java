public class Boss extends GameEntity {

        private int numberFarrows;
        private Weapon bossWeapon;

        public int getNumberFarrows() {
            return numberFarrows;
        }

        public void setNumberFarrows(int numberFarrows) {
            this.numberFarrows = numberFarrows;
        }

        private int Machine;

    public int getMachine() {
        return Machine;
    }

    public void setMachine(int machine) {
        Machine = machine;
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
            return  getDamage()  +": "+ getHealth() +": "+ getNumberFarrows()
        + ":" +  getMachine() + ":" + getBossWeapon();
        }
    }



