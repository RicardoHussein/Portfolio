using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Countries")]
    public class Country
    {
        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "ID")]
        public int countryID { get; set; }

        [Display(Name = "Designation")]
        [Required]
        public string designation { get; set; }

        public System.DateTime RegistrationDateTime { get; set; }

        public string Registrator { get; set; }
    }
}
