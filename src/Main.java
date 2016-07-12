public class Main {

    public static void main(String[] args) {

        int n = (int) (Math.random() * 7) + 3; // 3~ 10

        int enemy[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            enemy[i] =  (int) (Math.random() * 20) - 10; // -10 ~ 10
        }

        int energy = getMinimalEnergy(enemy);

        simulation(energy, enemy);
    }

    public static int getMinimalEnergy(int[] enemy){

        int totalEnergy = 0;

        if(enemy == null || enemy.length < 0){
            return totalEnergy;
        }

        int hp = 0;
        for(int i = 0 ; i < enemy.length ; i ++){
            hp += enemy[i];
            if(hp < 1){
                totalEnergy += Math.abs(hp) + 1;
                hp = 1;
            }
        }
        return totalEnergy ;
    }


    public static void simulation(int hp, int[] enemy){

        int current = hp;
        System.out.println("Minimum HP :" + hp);

        for(int i = 0 ; i < enemy.length ; i ++){
            System.out.println("step[" + i + "] hp:" + current);
            current += enemy[i];
            System.out.println("- fight " + enemy[i]  + " -->  " + current );
        }
    }


}
