package dev.tr7zw.exordium.util.rendersystem;

public class MultiStateHolder implements StateHolder {

    private boolean fetched = false;
    private final StateHolder[] holders;

    public boolean isFetched() {
        return fetched;
    }

    public MultiStateHolder(StateHolder... holders) {
        this.holders = holders;
    }

    @Override
    public void fetch() {
        fetched = true;
        for (StateHolder s : holders) {
            s.fetch();
        }
    }

    @Override
    public void apply() {
        if (!fetched)
            return;
        for (StateHolder s : holders) {
            s.apply();
        }
    }

}
