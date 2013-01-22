/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.core.command.basic;

import org.jrebirth.core.command.DefaultMultiCommand;
import org.jrebirth.core.concurrent.RunType;
import org.jrebirth.core.wave.Wave;
import org.jrebirth.core.wave.WaveBean;

/**
 * The class <strong>ShowModelCommand</strong>.
 * 
 * @author Sébastien Bordes
 */
public class ShowModelCommand extends DefaultMultiCommand {

    /**
     * Default Constructor.
     */
    public ShowModelCommand() {
        super(RunType.JIT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addSubCommand() {
        addCommandClass(PrepareModelCommand.class);
        addCommandClass(AttachModelCommand.class);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends WaveBean> getWaveBeanClass() {
        return DisplayModelWaveBean.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void processAction(final Wave wave) {
        // Nothing to do yet
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void waveCancelled(final Wave wave) {
        // Nothing to do yet

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void waveDestroyed(final Wave wave) {
        // Nothing to do yet

    }

}
