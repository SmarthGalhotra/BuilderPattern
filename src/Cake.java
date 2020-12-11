public class Cake {
    private double sugar;
    private  double butter;
    private  int eggs;
    private  int vanilla;
    private  double flour;
    private  double bakingPowder;
    private  double milk;
    private  int cherry;

    static class CakeBaker{
        double sugar;
        double butter;
        int eggs;
        int vanilla;
        double flour;
        double bakingPowder;
        double milk;
        int cherry;


        CakeBaker(double flour, double bakingPowder, double milk){
            this.flour =  flour;
            this.bakingPowder = bakingPowder;
            this.milk = milk;
        }

        CakeBaker addSugar(double sugar){
            this.sugar = sugar;
            return this;
        }

        CakeBaker addButter(double butter){
            this.butter = butter;
            return this;
        }

        CakeBaker addEggs(int eggs){
            this.eggs = eggs;
            return this;
        }
        CakeBaker addVanilla(int vanilla){
            this.vanilla = vanilla;
            return this;
        }
        CakeBaker addCherry(int cherry){
            this.cherry = cherry;
            return this;
        }

        Cake  bake() {
            if(this.vanilla > 0 && this.sugar==0){
                throw new Exception("Please add sugar along with vanilla");
            }
            Cake cake = new Cake();
            cake.sugar = this.sugar;
            cake.bakingPowder = this.bakingPowder;
            cake.butter = this.butter;
            cake.cherry = this.cherry;
            cake.eggs = this.eggs;
            cake.flour = this.flour;
            cake.milk = this.milk;
            cake.vanilla = this.vanilla;

            return cake;

        }
    }
}