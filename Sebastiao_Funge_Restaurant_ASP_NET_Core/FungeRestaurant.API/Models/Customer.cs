using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Customers")]
    public class Customer
    {
        [Required]
        [Display(Name = "Customer")]
        public String customerName { get; set; }


        [Required]
        [Display(Name = "Address")]
        public String address { get; set; }

        [Required]
        [Display(Name = "Cellphone")]
        public String cellphone { get; set; }

        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "Customer Number")]
        public int CustomerID { get; set; }

        //[Required]
        [Display(Name = "Registration Date and Time")]
        public DateTime RegistrationDateTime { get; set; }

        public string Registrator { get; set; }


        //[Required]
        [Display(Name = "Email")]
        [EmailAddress]
        public string Email { get; set; }


        public int? countryID { get; set; }

        //[Required]
        public virtual Country country { get; set; }

    }
}

