/*******************************************************************************
 * Copyright 2011 Netflix
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.netflix.astyanax.connectionpool.exceptions;

/**
 * No more connections may be opened on a host and no timeout was specified.
 * 
 * @author elandau
 *
 */
public class MaxConnsPerHostReachedException extends ConnectionException {
	public MaxConnsPerHostReachedException(String message) {
		super(message, true);
	}
	
	public MaxConnsPerHostReachedException(Throwable t) {
		super(t, true);
	}
	
	public MaxConnsPerHostReachedException(String message, Throwable cause) {
        super(message, cause, true);
    }
}
