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

        YadeaFault mYadeaFault = YadeaFault.build(new byte[]{(byte) 0xff,0,0,0,0,0,0,0,0,0});

        assertArrayEquals(new int[]{mYadeaFault.getElectric()},new int[]{1});
//        ...

    }

}