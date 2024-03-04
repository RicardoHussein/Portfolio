using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Restaurants")]
    public class Restaurant
    {
        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "Restaurant Number")]
        public int RestaurantID { get; set; }


        //[Required]
        [Display(Name = "Restaurant Address")]
        public String RestaurantAddress { get; set; }

        //[Required]
        [Display(Name = "Registration Date and Time")]
        public DateTime RegistrationDateTime { get; set; }

        public string Registrator { get; set; }

        public int? countryID { get; set; }

        //[Required]
        public virtual Country country { get; set; }
    }
}
