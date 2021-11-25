package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setWeapon(new Weapon("Grenade launcher","Scythe"));
        System.out.println("Жизнь босса " + boss.getHealth() +  " " + " Урон босса" + boss.getDamage() + "Тип оружия" +   boss.weapon.getName()  + " " +  "название оружии" +
                boss.weapon.getTybe());
    }
}
