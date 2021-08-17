package sec06.exam06;
	/*
	 * on this section, getter and setter method has been used.
	 * 'setter' method checks only valid parameter value to on the object's field.
	 * 'getter' method  artificially temporary modified the field value and send them outside.
	 * 'getter and setter' appears on object. not for the operation class.
	 */
	public class Car {
		// field
		private int speed;
		private boolean stop;
		
		//constructor
		
		//method
		
		public int getSpeed() { // method and this uses getter... it temporary gives the field value
			return speed;
		}
		public void setSpeed(int speed) { // method was declared...this set method allows only parameter.
			if(speed < 0) {  // this won't allow negative value it would save as 0 value and returns...
				this.speed = 0;
				return;
			} else {
				this.speed = speed;
			}
		}
		//getter (when field type is boolean, getter starts as 'is'
		public boolean isStop() { //  method
			return stop;
			/* restrict: public
			 * return type: field type
			 * method name: is + Field name
			 * return value: field value
			 */
			
		}
		//setter
		public void setStop(boolean stop) { // method is declared
			this.stop = stop;
			this.speed = 0;
			/* restrict: public
			 * return type: void
			 * method name: set+ field name(first letter gotta be capital letter
			 * parameter variable type: field type.
			 */
		}
	
	}
