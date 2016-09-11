/*
 * ListNode.java
 * 
 * Copyright 2016 Ramprasad <ramprasad@ramprasad-Inspiron-5420>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


	public class ListNode{
		 int data;
		 ListNode next;
		
		public ListNode(int data){
			this.data = data;
		}
		
		public void setData(int data){
		this.data = data;
		}
		
		public int getData(){
		return data;
		}
		
		public void setNext(ListNode next){
		this.next = next;	
		}
		
		public ListNode getNext(){
		return this.next;
		}
	
	}

