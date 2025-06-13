function Form() {
  return (
    <div>
      <form>
        <fieldset>
          <h2 align="center">Registration Form</h2>
          <h3>Student Details</h3>
           <label>First Name: </label>
          <input type="text" name="lastName" />
          <br />
          <br /> 
          <label>Last Name: </label>
          <input type="text" name="lastName" />
          <br />
          <br />

          <label>Email Id: </label>
          <input type="email" name="email" />
          <br />
          <br />

          <label>Mobile Number: </label>
          <input type="number" name="mobile" />
          <br />
          <br />

          <h3>Address</h3>
          <input type="text" name="street" placeholder="Street Address" />
          <br />
          <br />

          <input type="text" name="city" placeholder="City" />
          <br />
          <br />

          <input type="text" name="state" placeholder="State/Province" />
          <br />
          <br />

          <input type="text" name="country" placeholder="Country" />
          <br />
          <br />

          <input type="text" name="pincode" placeholder="Pincode" />
          <br />
          <br />

          <label>Gender:</label><br />
          <input type="radio" name="gender" value="female" /> Female <br />
          <input type="radio" name="gender" value="male" /> Male <br />
          <input type="radio" name="gender" value="other" /> Other
          <br />
          <br />

          <h3>Personal Details</h3>
          <label>Date of Birth: </label>
          <input type="date" name="dob" />
          <br />
          <br />

          <label>Education: </label>
          <select name="education">
            <option value="10th">10th</option>
            <option value="12th">12th</option>
            <option value="diploma">Diploma</option>
            <option value="btech">B.Tech</option>
            <option value="other">Other</option>
          </select>
          <br /> 
          <br />

          <button type="submit">Submit</button>
        </fieldset>
      </form>
    </div>
  );
}

export default Form;