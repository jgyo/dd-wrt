/* cmdline.h */

/* File autogenerated by gengetopt version 2.7.1  */

#ifndef _cmdline_h
#define _cmdline_h

#ifdef __cplusplus
extern "C" {
#endif /* __cplusplus */

/* Don't define PACKAGE and VERSION if we use automake.  */
#ifndef PACKAGE
#define PACKAGE "lzma"
#endif

#ifndef VERSION
#define VERSION "0.01"
#endif

struct gengetopt_args_info
{
  int decode_flag;	/* Decode a compressed lzma file (default=off).  */
  int dictsize_arg;	/* Dictionary size in bit (default=20).  */
  int fastbytes_arg;	/* Number of fast bytes (default=32).  */
  int high_flag;	/* Use better, slower compression (default=off).  */

  int help_given ;	/* Whether help was given.  */
  int version_given ;	/* Whether version was given.  */
  int decode_given ;	/* Whether decode was given.  */
  int dictsize_given ;	/* Whether dictsize was given.  */
  int fastbytes_given ;	/* Whether fastbytes was given.  */
  int high_given ;	/* Whether high was given.  */

} ;

int cmdline_parser (int argc, char * const *argv, struct gengetopt_args_info *args_info);

void cmdline_parser_print_help(void);
void cmdline_parser_print_version(void);

#ifdef __cplusplus
}
#endif /* __cplusplus */
#endif /* _cmdline_h */
