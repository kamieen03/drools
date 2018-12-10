package music;

public class BrokenAmplifier {
    public static Question newQ1() {
        return new Question("Is there sound?",
                1);
    }

    public static Question newQ2() {
        return new Question("Are tubes and pilot lamps lighted?",
                2);
    }

    public static Question newQ3() {
        return new Question("Can you hear a sound?",
                "Check controls on amplifier for normal setting." +
                        "Instrument controls should be all the way on." +
                        "Also check standby switch, if any.",
                3);
    }

    public static Question newQ4() {
        return new Question("Can you hear humming?",
                "Turn volume all the way on and listen to hum.",
                4);
    }

    public static Question newQ5() {
        return new Question("Can you hear the sound?",
                "Substitute tubes with known good ones.",
                5);
    }

    public static Question newQ6() {
        return new Question("Can you hear the click?",
                "Unsolder one of the wires from speaker." +
                        "Touch one end of a flashlight battery to the unsoldered speaker wire," +
                        "the other to the empty speaker terminal." +
                        " Listen for a click from speaker.",
                6);
    }

    public static Question newQ7() {
        return new Question("Can you hear the clicking sound?",
                "Defective speaker, leads or uoutput transformer." +
                        "Apply flashlight battery voltage directly to speaker termianls.",
                7);
    }

    public static Question newQ8() {
        return new Question(null,
                "Speaker is OK, the trouble is in the speaker leads or output transformer." +
                        "Repair leads by yourself or take amplifier to a competent" +
                        "repair service.",
                8);
    }

    public static Question newQ9() {
        return new Question(null,
                "Voice coil on speaker open; replace speaker.",
                        9);
    }

    public static Question newQ10() {
        return new Question(null,
                "Spekaer, leads and output transformer secondary OK." +
                        "Take amplifier to a competent repair service.",
                10);
    }

    public static Question newQ11() {
        return new Question("Has humming grew louder?",
                "Unplug cable from instrument and touch the tip of the plug.",
                11);
    }

    public static Question newQ12() {
        return new Question(null,
                "Check cable between instrument and amplifier." +
                        "Repair or substitute with a good cable.",
                12);
    }

    public static Question newQ13() {
        return new Question(null,
                "Check and repair pickup on instrument.",
                13);
    }


    public static Question newQ14() {
        return new Question("Is outlet alright?",
                "Check wall outlet. Plug in something you know that works.",
                14);
    }

    public static Question newQ15() {
        return new Question("Is fuse OK?",
                "Replace fuse on amplifier (fuse could be defective and still" +
                        "appear to be OK.",
                15);
    }

    public static Question newQ16() {
        return new Question(null,
                "Check line cord, plug or on-off switch.",
                16);
    }

    public static Question newQ17() {
        return new Question("Does fuse blow repeteadly?",
                "Check for short in amplifier." +
                "Sobstitute tubes if possible and by prcess of" +
                " elimination locate shorted one. Especially tubes" +
                " such as 5Y3, 5U4, 5AR4, 6V6, 6L6, 7591, 7027A," +
                " EL-37, 5881.",
                17);
    }

    public static Question newQ18() {
        return new Question(null,
                "Take amplifier to a competent repair service.",
                18);
    }


    public static Question newQ19() {
        return new Question(null,
                "Check for blown house fuse and replace it.",
                19);
    }


    public static Question newQ20() {
        return new Question("Is sound distorted on all channels?",
                null,
                20);
    }

    public static Question newQ21() {
        return new Question("Is sound OK?",
                "Control settings may be too high, especially volume.",
                21);
    }


    public static Question newQ22() {
        return new Question("Is sound OK?",
                "Pickup, instrument or connecting cable may be defective; " +
                        "substitute with one known to be good if possible " +
                        "(especially the cable).",
                22);
    }

    public static Question newQ23() {
        return new Question("Is sound OK?",
                "See that tubes are firmly seated in their sockets. " +
                        "Also any internal wiring using plugins; must be secure.",
                23);
    }

    public static Question newQ24() {
        return new Question("Is sound OK now?",
                "Check tubes: if possible substitute tubes known to " +
                        "be good, one at a time, starting with the output tubes. " +
                        "Common output tube types are: 6V6, 6L6, 5881, EL-37, " +
                        "EL-34, EL-84, KT-66, ^BG6, 6BQ5, 7591, 7027A.",
                24);
    }

    public static Question newQ25() {
        return new Question("Is sound OK now?",
                "Replace rectifier tube. This is probably a 5U4, " +
                        "5Y3, 6X4, 6X5, 6AX5, 5V4, 6CA4, 5AR4.",
                25);
    }

    public static Question newQ26() {
        return new Question("Is sound OK now?",
                "Follow the same procedure with the rest of the " +
                        "tubes: the pahse inverter and voltage amplifier " +
                        "tubes; Common tube types: 6SL7, 6SN7, 12AY7, 12AU7, " +
                        "12AT7, 6CG7, 6EU7, 7025.",
                26);
    }

    public static Question newQ27() {
        return new Question(null,
                "Disconnect the speaker. Use test speaker or " +
                        "test amplifier to determine which is distorting.",
                27);
    }

    public static Question newQ28() {
        return new Question("Is sound OK now?",
                "Check Preamp Tubes. Most common Preamp Tube " +
                        "types are: 6SL7, 6SN7, 12AX7, 12AY7, 12AU7, " +
                        "12AT7, 6C5, 6J5, 6SC7, 6CG7, 6EU7, 6AN8. " +
                        "If amplifier has more than one of these, " +
                        "try interchanging, using Preamp Tube from the " +
                        "channel that sounds OK in channel that distorts.",
                28);
    }



}
