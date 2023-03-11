/*
 * This file is part of Charon.
 *
 * Charon is a framework for Spigot plugin development
 * Copyright (C) 2023  SickSkillz
 *
 * Charon is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Charon is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Charon.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.sickskillz.charon.module;

import dagger.Module;
import dagger.Provides;
import org.bukkit.plugin.Plugin;
import org.sickskillz.charon.CharonFramework;

@Module
public class CharonFrameworkModule {

    @Provides
    public Plugin providePlugin() {
        return CharonFramework.getPlugin();
    }
}
