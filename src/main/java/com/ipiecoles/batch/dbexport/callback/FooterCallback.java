package com.ipiecoles.batch.dbexport.callback;

import com.ipiecoles.batch.repository.CommuneRepository;
import org.springframework.batch.item.file.FlatFileFooterCallback;

import java.io.IOException;
import java.io.Writer;

public class FooterCallback implements FlatFileFooterCallback {

    private final CommuneRepository communeRepository;

    @Override
    public void writeFooter(Writer writer) throws IOException {
        writer.write("Total communes : " + communeRepository.countCommune());
    }

    public FooterCallback(CommuneRepository communeRepository) {
        this.communeRepository = communeRepository;
    }
}