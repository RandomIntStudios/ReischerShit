package com.ristudios.objectoriented;

public class Interval {

    private final int from, to;

    public Interval(int from, int to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
            this.from = 0;
            this.to = 0;
        }
    }

    public Interval(Interval origin) {
        this.from = origin.from;
        this.to = origin.to;
    }

    public Interval copy() {
        return new Interval(this.from, this.to);
    }

    public boolean inInterval(int x) {
        return x >= from && x <= to;
    }

    public boolean inInterval(int x, boolean fromIncl, boolean toIncl) {
        if (fromIncl && toIncl) {
            return x >= from && x <= to;
        } else if (!fromIncl && toIncl) {
            return x > from && x <= to;
        } else if (fromIncl) {
            return x >= from && x < to;
        }

        //CODE
        // if (fromIncl) {
        //     if (toIncl) {
        //         return x >= from && x <= to;
        //     } else return x >= from && x < to;
        // } else if (toIncl) {
        //     return x > from && x <= to;
        // }

        return x > from && x < to;

    }

}
