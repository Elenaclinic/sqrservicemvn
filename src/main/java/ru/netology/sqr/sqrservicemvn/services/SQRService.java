package ru.netology.sqr.sqrservicemvn.services;

public class SQRService {

    public int calcSQR(int x, int y) {
        int total = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= x) && (i * i <= y)) {
                total++;
            }
        }
        return total;
    }


}
