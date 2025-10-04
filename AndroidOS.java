class AndroidOS implements OperatingSystem {
    private final String version;

    public AndroidOS(String version) {
        this.version = version;
    }

    @Override
    public String getName() {
        return "Android";
    }

    @Override
    public String getVersion() {
        return version;
    }
}