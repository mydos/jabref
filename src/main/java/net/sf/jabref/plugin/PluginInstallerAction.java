/*  Copyright (C) 2003-2011 JabRef contributors.
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/
package net.sf.jabref.plugin;

import net.sf.jabref.JabRefFrame;
import net.sf.jabref.MnemonicAwareAction;
import net.sf.jabref.Globals;
import net.sf.jabref.GUIGlobals;

import java.awt.event.ActionEvent;

/**
 * Created by IntelliJ IDEA.
 * User: alver
 * Date: Mar 27, 2009
 * Time: 11:33:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class PluginInstallerAction extends MnemonicAwareAction {
    private JabRefFrame frame;

    public PluginInstallerAction(JabRefFrame frame) {
        super(GUIGlobals.getImage("plugin"));
        //System.out.println();
        this.frame = frame;
        putValue(NAME, Globals.menuTitle("Manage plugins"));

    }
    
    public void actionPerformed(ActionEvent actionEvent) {
        ManagePluginsDialog mpd = new ManagePluginsDialog(frame);
        mpd.setVisible(true);
    }

    
}
