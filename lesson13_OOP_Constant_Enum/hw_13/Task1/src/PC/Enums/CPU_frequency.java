package PC.Enums;

public enum CPU_frequency {
    CPU_FREQUENCY_43(4300),
    CPU_FREQUENCY_37(3700),
    CPU_FREQUENCY_40(4000);
    public final int count;

    CPU_frequency(int count) {
        this.count = count;
    }
}
