package cz.educanet.praha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ILanderControls controls = new UILanding();
        try {
            final var lander = new LunarLanding(
                    controls,
                    5000,
                    500
            );
            System.out.println("Total amount of fuel: " + lander.land());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

class UILanding implements ILanderControls {
    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        System.out.println("Altitude: " + altitude + "\nVelocity: " + velocity + "\n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
