package br.com.amy.exerc26;

public enum Machines {
    SENTINELS	(true),
    HARVESTERS	(false),
    CARETAKERS	(false),
    B1_SERIES	(false),
    AMBASSADOR_01	(false),
    THE_ARCHITECT	(false),
    DOC_BOT	(false),
    RUNNERS	(true),
    BUGS	(true),
    DIGGERS	(true),
    TOW_BOMBS	(true),
    ARMADAS	(true),
    GARBAGE_TRUCK	(false),
    DEUS_EX_MACHINA	(true),
    PROGRAMS	(true);

    private final boolean aggressive;

    Machines(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public boolean isAggressive() {
        return aggressive;
    }
}
