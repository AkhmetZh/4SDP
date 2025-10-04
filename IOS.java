class IOS implements OperatingSystem {
    private final String version;

    public IOS(String version) {
        this.version = version;
    }

    @Override
    public String getName() {
        return "iOS";
    }

    @Override
    public String getVersion() {
        return version;
    }
}