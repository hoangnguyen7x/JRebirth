package org.jrebirth.af.component.command.dock;

import org.jrebirth.af.api.key.UniqueKey;
import org.jrebirth.af.api.ui.Model;
import org.jrebirth.af.api.wave.Wave;
import org.jrebirth.af.component.ui.beans.PartConfig;
import org.jrebirth.af.component.ui.dock.DockModel;
import org.jrebirth.af.core.command.single.ui.DefaultUIBeanCommand;
import org.jrebirth.af.core.exception.CommandException;
import org.jrebirth.af.core.wave.WBuilder;

public class AddDockCommand extends DefaultUIBeanCommand<DockWaveBean> {

    @Override
    protected void initCommand() {
    }

    @Override
    protected void perform(final Wave wave) throws CommandException {

        // Perform check

        // This command is running into JTP
        // So launch another wave that will processed by Model into JAT

        if (waveBean(wave).model() != null) {
            for (final Model model : waveBean(wave).model()) {
                sendWaveToTabModel(wave, model);
            }
        }

        if (waveBean(wave).modelKey() != null) {
            for (final UniqueKey<? extends Model> modelKey : waveBean(wave).modelKey()) {
                sendWaveToTabModel(wave, getModel(modelKey));
            }
        }

        if (waveBean(wave).parts() != null) {
            for (final PartConfig<?> part : waveBean(wave).parts()) {
                sendWaveToTabModel(wave, getModel(part.modelClass(), part));
            }
        }
    }

    private void sendWaveToTabModel(final Wave wave, final Model model) {

        sendWave(WBuilder.wave()
                         .waveType(DockModel.ADD)
                         .componentClass(DockModel.class)
                         .addDatas(
                                   WBuilder.waveData(DockModel.DOCK_KEY, waveBean(wave).dockConfig().key()),
                                   WBuilder.waveData(DockModel.MODEL, model)
        // ,
        // Builders.waveData(DockModel.MODEL, model )
        ));

        // getModel(TabModel.class, getWaveBean(wave).dockConfig()).addTab(model, wave);
    }

}
