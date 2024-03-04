using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Salespeople")]
    public class Salesperson
    {
        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "Salesperson Number")]
        public int SalespersonID { get; set; }

        [Required]
        [Display(Name = "Salesperson")]
        public String SalespersonName { get; set; }

        [Required]
        [Display(Name = "Cellphone")]
        public String cellphone { get; set; }



        //[Required]
        [Display(Name = "Email")]
        [EmailAddress]
        public string Email { get; set; }

        //[Required]
        [Display(Name = "Salesperson Address")]
        public String SalespersonAddress { get; set; }

        //[Required]
        [Display(Name = "Registration Date and Time")]
        public DateTime RegistrationDateTime { get; set; }

        public string Registrator { get; set; }

        public int? countryID { get; set; }

        //[Required]
        public virtual Country country { get; set; }
    }
}
