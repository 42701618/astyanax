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
package com.netflix.astyanax.connectionpool;

import com.netflix.astyanax.connectionpool.exceptions.ConnectionException;

/**
 * Interface to an instance of a connection on a host.
 * 
 * @author elandau
 *
 * @param <CL>
 */
public interface Connection<CL> {
	/**
	 * Execute an operation on the connection and return a result
	 * 
	 * @param <R>
	 * @param op
	 * @return
	 * @throws ConnectionException 
	 */
	public <R> OperationResult<R> execute(Operation<CL, R> op) throws ConnectionException;

	/**
	 * Shut down the connection.  isOpen() will now return false.
	 */
	public void close();

	/**
	 * Determine if the connection is open.
	 * @return
	 */
	public boolean isOpen();
	
	/**
	 * Get the parent host connection pool.
	 * @return
	 */
	public HostConnectionPool<CL> getHostConnectionPool();
	
	/**
	 * Get the last exception that caused the connection to be closed
	 * @return
	 */
	public ConnectionException getLastException();
	
	/**
	 * Open a connection
	 * @throws ConnectionException 
	 */
	void open() throws ConnectionException;
	
}
