package com.expediagroup.dropwizard.bundle.configuration.freemarker;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import io.dropwizard.configuration.ConfigurationSourceProvider;

public class TestConfigSourceProvider implements ConfigurationSourceProvider {

    @Override
    public InputStream open(final String config) throws IOException {
        return IOUtils.toInputStream(config, Charset.defaultCharset());
    }

}
