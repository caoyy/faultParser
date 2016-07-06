package com.rokyinfo.ble.toolbox.protocol.model;

import com.rokyinfo.convert.RkFieldConverter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apple on 16/6/28.
 */
public class YadeaFaultTest {

    @Test
    public void yadeaFaultBuildTest() throws Exception {

        YadeaFault mYadeaFault = YadeaFault.build(new byte[]{(byte) 0,0,0,0,0,9,0,0,0,0});

        assertArrayEquals(new int[]{mYadeaFault.getPowerManager(), mYadeaFault.getConverter()},new int[]{1, 1});
//        ...

    }

}