/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package etk.web.core.text;

import java.io.IOException;

/**
 * Created by The eXo Platform SAS Author : eXoPlatform exo@exoplatform.com Mar
 * 23, 2012
 */
public class WriterPrinter implements Printer {

  /** . */
  protected final Appendable writer;

  public WriterPrinter(Appendable writer) {
    if (writer == null) {
      throw new NullPointerException("No null writer accepted");
    }

    //
    this.writer = writer;
  }

  public void write(char c) throws IOException {
    writer.append(c);
  }

  public void write(CharSequence s) throws IOException {
    writer.append(s);
  }

  public void write(String s) throws IOException {
    writer.append(s);
  }

  public void write(CharArray chars) throws IOException {
    chars.write(writer);
  }
}
