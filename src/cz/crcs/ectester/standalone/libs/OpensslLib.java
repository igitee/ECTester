package cz.crcs.ectester.standalone.libs;

import java.security.Provider;
import java.util.Set;

/**
 * @author Jan Jancar johny@neuromancer.sk
 */
public class OpensslLib extends NativeECLibrary {
    public OpensslLib() {
        super("openssl_provider", "crypto");
    }

    @Override
    public native boolean supportsNativeTiming();

    @Override
    public native long getNativeTimingResolution();

    @Override
    public native long getLastNativeTiming();

    @Override
    native Provider createProvider();

    @Override
    public native Set<String> getCurves();
}
