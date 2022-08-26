import java.util.Scanner;

public class Ben {
    public static void main(String[] args) {
        int svar = -1;
        String input = "";
        int length = (int) (Math.random()* 5 + 5);
        for (int i = 0; i<length; i++) {
            String a = "Therapist: Ok, vem frågade?";
            String b = "Therapist: på gud?";
            String c = "Therapist: nae, va sjukt";
            String d = "Therapist: det stämmer ju inte ens?";
            String f = "Therapist: F";
            String g = "Therapist: Håll käften";
            String h = "Therapist: Du ljuger";
            String e = "Therapist: ...";
            String j = "Therapist: Today's video is sponsored by Raid Shadow Legends, one of the biggest mobile role-playing games of 2019 and it's totally free! Currently almost 10 million users have joined Raid over the last six months, and it's one of the most impressive games in its class with detailed models, environments and smooth 60 frames per second animations! All the champions in the game can be customized with unique gear that changes your strategic buffs and abilities! The dungeon bosses have some ridiculous skills of their own and figuring out the perfect party and strategy to overtake them's a lot of fun! Currently with over 300,000 reviews, Raid has almost a perfect score on the Play Store! The community is growing fast and the highly anticipated new faction wars feature is now live, you might even find my squad out there in the arena! It's easier to start now than ever with rates program for new players you get a new daily login reward for the first 90 days that you play in the game! So what are you waiting for? Go to the video description, click on the special links and you'll get 50,000 silver and a free epic champion as part of the new player program to start your journey! Good luck and I'll see you there!";
            String k = "Therapist: Förlåt, men jag bryr mig verkligen inte";
            String l = "Therapist: jaha";
            String m = "Therapist: HAHAHAHHAHAHA";
            String n = "Therapist: åh fy fan";
            String o = "Therapist: Jävla idiot";
            String p = "Therapist: L bozo";
            String q = "Therapist: Din mamma";
            String r = "Person utanför ica: hej hej!";
            String s = "Therapist: Du råkar inte ha en cigarett?";
            String t = "Therapist: Jag kommer fan behöva en therapist efter att ha lyssnat på ditt tråkiga liv";
            String u = "Therapist: Du luktar skit!";
            String v = "Therapist: är du på droger";
            String w = "Therapist: är du dum eller?";
            String y = "Therapist: Jävla idiot";
            String z = "Therapist: 💀💀💀";
            String aa = "Therapist: NÄÄÄ!!!!!";
            String ab = "Therapist: Du har downsyndrom";
            String ac = "Therapist: Kan du förklara lite mer?";
            String ad = "Therapist: ok, men hur går det med din familj?";
            String af = "Therapist: det där är ovikitigt";
            String ag = "Therapist: UT!!!";
            if (svar == -1) {
                System.out.println("Therapist: Vad skulle du vilja prata om?");
            } else if (input.length()>50) {
                System.out.println("Therapist: Jag orkar inte läsa det där");
            } else if (svar == 0) {
                System.out.println(a);
            } else if (svar == 1) {
                System.out.println(b);
            } else if (svar == 2) {
                System.out.println(c);
            } else if (svar == 3) {
                System.out.println(d);
            } else if (svar == 4) {
                System.out.println(e);
            } else if (svar == 5) {
                System.out.println(f);
            } else if (svar == 6) {
                System.out.println(g);
            } else if (svar == 7) {
                System.out.println(h);
            } else if (svar == 8) {
                System.out.println("Therapist: ok");
            } else if (svar == 9) {
                System.out.println(j);
            } else if (svar == 10) {
                System.out.println(k);
            } else if (svar == 11) {
                System.out.println(l);
            } else if (svar == 12) {
                System.out.println(m);
            } else if (svar == 13) {
                System.out.println(n);
            } else if (svar == 14) {
                System.out.println(o);
            } else if (svar == 15) {
                System.out.println(p);
            } else if (svar == 16) {
                System.out.println(q);
            } else if (svar == 17) {
                System.out.println(r);
            } else if (svar == 18) {
                System.out.println(s);
            } else if (svar == 19) {
                System.out.println(t);
            } else if (svar == 20) {
                System.out.println(u);
            } else if (svar == 21) {
                System.out.println(v);
            } else if (svar == 22) {
                System.out.println(w);
            } else if (svar == 23) {
                System.out.println(y);
            } else if (svar == 24) {
                System.out.println(z);
            } else if (svar == 25) {
                System.out.println(aa);
            } else if (svar == 26) {
                System.out.println(ab);
            } else if (svar == 27) {
                System.out.println(ac);
            } else if (svar == 28) {
                System.out.println(ad);
            } else if (svar == 29) {
                System.out.println(af);
            } else if (svar == 30) {
                System.out.println(ag);
            }
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            svar = (int) (Math.random() * 30);

        }
        System.out.println("Therapist has left the chat");
    }
}
