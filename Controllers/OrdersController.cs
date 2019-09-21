
using Microsoft.Extensions.Configuration;
using Dapper;
using System.Data.SqlClient;
using Microsoft.AspNetCore.Mvc;

namespace OrderConsult.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class OrdersController : Controller
    {
        private IConfiguration _config;
        private string _defaultConnection = "DefaultConnection";
        private SqlConnection _sqlConnection;
        public OrdersController(IConfiguration configuration)
        {
            _config = configuration;
            _sqlConnection = _sqlConnection == null ? _sqlConnection = new SqlConnection(_config.GetConnectionString(_defaultConnection)) : _sqlConnection;
        }

        [HttpGet("cpf/{id}")]
        public JsonResult GetCPFCNPJ(string id)
        {

            string query = $"SELECT top 1 * FROM VW_MS_GETORDERS WHERE CPF_CNPJ =dbo.GetOnlyNumeric('{id}');";
            var dados = _sqlConnection.Query<Orders>(query);
            return Json(dados);

        }

        [HttpGet("NumeroSinistro/{id}")]
        public JsonResult GetNumeroSinistro(string id)
        {
            string query = $"SELECT top 1 * FROM VW_MS_GETORDERS WHERE NumeroSinistro =dbo.GetOnlyNumeric('{id}');";
            var dados = _sqlConnection.Query<Orders>(query);
            return Json(dados);

        }

        [HttpGet("NumeroOS/{id}")]
        public JsonResult GetNumerOS(string id)
        {

            string query = $"SELECT top 1 * FROM VW_MS_GETORDERS WHERE NumOS =dbo.GetOnlyNumeric('{id}');";
            var dados = _sqlConnection.Query<Orders>(query);
            
            return Json(dados);

        }

    }
}