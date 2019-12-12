/*
 * Minecraft Forge
 * Copyright (c) 2016-2019.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.fml.event.lifecycle;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.ModContainer;

public class ModLifecycleEvent extends Event {
	private final ModContainer container;

	// For EventBus
	public ModLifecycleEvent() {
		this(null);

		this.description();
	}

	public ModLifecycleEvent(ModContainer container) {
		this.container = container;
	}

	public final String description() {
		String cn = getClass().getName();
		return cn.substring(cn.lastIndexOf('.') + 1);
	}

	// TODO
	/*public Stream<InterModComms.IMCMessage> getIMCStream() {
		return InterModComms.getMessages(this.container.getModId());
	}

	public Stream<InterModComms.IMCMessage> getIMCStream(Predicate<String> methodFilter) {
		return InterModComms.getMessages(this.container.getModId(), methodFilter);
	}*/

	@Override
	public String toString() {
		return description();
	}
}
