/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2016
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
package org.jrebirth.af.core.wave;

import java.io.File;

import org.jrebirth.af.api.annotation.PriorityLevel;
import org.jrebirth.af.api.wave.Wave;
import org.jrebirth.af.api.wave.contract.WaveItem;

/**
 * The Interface JRebirthItems.
 */
public interface JRebirthItems {

    /** The {@link Void} wave item will be used only into a WaveData to wrap the VOID value when nothing is returned. The Void type cannot be used into a method signature. */
    WaveItem<Void> voidItem = new WaveItemBase<Void>(false) {
    };

    /** The {@link Wave} wave item (not a parameter). */
    WaveItem<Wave> waveItem = new WaveItemBase<Wave>(false) {
    };

    /** The {@link Exception} wave item (not a parameter). */
    WaveItem<Throwable> exceptionItem = new WaveItemBase<Throwable>(false) {
    };

    /** The {@link Class} wave item. */
    WaveItem<Class<?>> classItem = new WaveItemBase<Class<?>>() {
    };

    /** The {@link Boolean} wave item. */
    WaveItem<Boolean> booleanItem = new WaveItemBase<Boolean>() {
    };

    /** The {@link String} wave item. */
    WaveItem<String> stringItem = new WaveItemBase<String>() {
    };

    /** The {@link Character} wave item. */
    WaveItem<Character> characterItem = new WaveItemBase<Character>() {
    };

    /** The {@link Byte} wave item. */
    WaveItem<Byte> byteItem = new WaveItemBase<Byte>() {
    };

    /** The {@link Short} wave item. */
    WaveItem<Short> shortItem = new WaveItemBase<Short>() {
    };

    /** The {@link Integer} wave item. */
    WaveItem<Integer> integerItem = new WaveItemBase<Integer>() {
    };

    /** The {@link Long} wave item. */
    WaveItem<Long> longItem = new WaveItemBase<Long>() {
    };

    /** The {@link Float} wave item. */
    WaveItem<Float> floatItem = new WaveItemBase<Float>() {
    };

    /** The {@link Double} wave item. */
    WaveItem<Double> doubleItem = new WaveItemBase<Double>() {
    };

    /** The {@link File} wave item. */
    WaveItem<File> fileItem = new WaveItemBase<File>() {
    };

    /** The special WaveItem used to declare that an execution shall be done synchronously in the the given thread that is processing this wave. */
    WaveItem<Boolean> runSynchronously = new WaveItemBase<Boolean>("runSynchronously") {
    };

    /** The special WaveItem used to define the timeout to use for all synchronized execution. */
    WaveItem<Long> syncTimeout = new WaveItemBase<Long>() {
    };

    /** The special WaveItem used to define the priority for the given thread that will process the wave. */
    WaveItem<PriorityLevel> priority = new WaveItemBase<PriorityLevel>() {
    };

}
