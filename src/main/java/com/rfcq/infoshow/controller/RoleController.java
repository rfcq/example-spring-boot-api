package com.rfcq.infoshow.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    //Create new Role
//    @PostMapping("/create")
//    public ResponseEntity<RoleDTO> createRole(@Valid @RequestBody RoleDTO role){
//        try {
//            RoleDTO roleDto = roleRepository.save(new RoleDTO(
//                    role.getRoleName()
//            ));
//            return new ResponseEntity<>(roleDto, HttpStatus.CREATED);
//        } catch(Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<RoleDTO> getRoleById(@PathVariable(value = "id") Long id)
//        throws ResourceNotFoundException {
//            RoleDTO roleDTO = roleRepository.findById(id)
//                    .orElseThrow(() -> new ResourceNotFoundException("User not found with this ID: " + id));
//
//            return ResponseEntity.ok().body(roleDTO);
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<List<RoleDTO>> getAllRoles() {
//        List<RoleDTO> rolesList = roleRepository.findAll();
//        return new ResponseEntity<List<RoleDTO>>(rolesList,HttpStatus.OK);
//    }
//    //Update role
//    @PutMapping()
//    public ResponseEntity<RoleDTO> updateUser(@PathVariable(value = "id") Long id,
//                                              @RequestBody RoleDTO role)
//    throws ResourceNotFoundException {
//
//        RoleDTO roleData = roleRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found with the ID: " + id));
//
//        roleData.setRoleName(role.getRoleName());
//        final RoleDTO roleUpdated = roleRepository.save(roleData);
//        return ResponseEntity.ok(roleUpdated);
//    }
//
//    @DeleteMapping(path="/{id}")
//    public Map<String, Boolean> deleteRoleById(@PathVariable(value = "id") Long id)
//            throws ResourceNotFoundException {
//
//        RoleDTO roleData = roleRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found with the ID: " + id));
//
//        roleRepository.deleteById(id);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("Deleted", Boolean.TRUE);
//        return response;
//    }
//
//    @DeleteMapping("/")
//    public ResponseEntity<HttpStatus> deleteAllUsers() {
//        try {
//            roleRepository.deleteAll();
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
