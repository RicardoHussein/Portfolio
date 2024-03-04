using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace FungeRestaurant.API.Models
{
    [Table("SEBASTIAO_RESTAURANT_Products")]
    public class Product
    {
        [System.ComponentModel.DataAnnotations.Key]
        //[DatabaseGenerated(DatabaseGeneratedOption.None)]
        [Display(Name = "Product Number")]
        public int ProductID { get; set; }


        [Display(Name = "Designation")]
        [Required]
        public string designation { get; set; }

        [Display(Name = "Description")]
        //[Required]
        public string description { get; set; }

        [Display(Name = "Price")]
        [Required]
        public Double price { get; set; }

        [Display(Name = "Product Image")]
        public string? ImageName { get; set; }

    }
}
