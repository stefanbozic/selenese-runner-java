package jp.vmi.selenium.selenese;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Test for {@link Proxy}.
 */
public class ProxyTest {

    /**
     * Test of start() and kill() continuously.
     */
    @Test
    @Ignore("ignore by #29")
    public void continuouslyInvoke() {
        for (int i = 0; i < 20; i++) {
            WebrickServer proxy = new Proxy();
            proxy.start();
            proxy.kill();
        }
    }

    /**
     * Test of start() and kill().
     */
    @Test(timeout = 10000)
    @Ignore("ignore by #30")
    public void startAndKill() {
        WebrickServer proxy = new Proxy();
        proxy.start();
        proxy.kill();
        assertThat(NetUtils.canUse(proxy.getPort()), is(true));
    }
}
