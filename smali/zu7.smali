.class public final synthetic Lzu7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Lzu7;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lzu7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzu7;->a:Lzu7;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.user.UserInfo"

    .line 11
    .line 12
    const/16 v3, 0x1b

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "app_metadata"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "aud"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "confirmation_sent_at"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "confirmed_at"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "created_at"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "email"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "email_confirmed_at"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "factors"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "id"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "identities"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "last_sign_in_at"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "phone"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "role"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "updated_at"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "user_metadata"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "phone_change_sent_at"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "new_phone"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "email_change_sent_at"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    const-string v0, "new_email"

    .line 110
    .line 111
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    const-string v0, "invited_at"

    .line 115
    .line 116
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    const-string v0, "recovery_sent_at"

    .line 120
    .line 121
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    const-string v0, "phone_confirmed_at"

    .line 125
    .line 126
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    const-string v0, "action_link"

    .line 130
    .line 131
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    const-string v0, "is_anonymous"

    .line 135
    .line 136
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    const-string v0, "is_sso_user"

    .line 140
    .line 141
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    const-string v0, "banned_until"

    .line 145
    .line 146
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    const-string v0, "deleted_at"

    .line 150
    .line 151
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    sput-object v1, Lzu7;->descriptor:Lll6;

    .line 155
    .line 156
    return-void
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 6

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/user/UserInfo;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x1b

    .line 6
    .line 7
    new-array v0, v0, [Lzr3;

    .line 8
    .line 9
    sget-object v1, Lxm3;->a:Lxm3;

    .line 10
    .line 11
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object v2, v0, v3

    .line 17
    .line 18
    sget-object v2, Lt47;->a:Lt47;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    aput-object v2, v0, v3

    .line 22
    .line 23
    sget-object v3, Lwd3;->a:Lwd3;

    .line 24
    .line 25
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x2

    .line 30
    aput-object v4, v0, v5

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    aput-object v5, v0, v4

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    aput-object v5, v0, v4

    .line 45
    .line 46
    const/4 v4, 0x5

    .line 47
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    aput-object v5, v0, v4

    .line 52
    .line 53
    const/4 v4, 0x6

    .line 54
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    aput-object v5, v0, v4

    .line 59
    .line 60
    const/4 v4, 0x7

    .line 61
    aget-object v5, p0, v4

    .line 62
    .line 63
    invoke-interface {v5}, Lnz3;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    aput-object v5, v0, v4

    .line 68
    .line 69
    const/16 v4, 0x8

    .line 70
    .line 71
    aput-object v2, v0, v4

    .line 72
    .line 73
    const/16 v4, 0x9

    .line 74
    .line 75
    aget-object p0, p0, v4

    .line 76
    .line 77
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Lzr3;

    .line 82
    .line 83
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    aput-object p0, v0, v4

    .line 88
    .line 89
    const/16 p0, 0xa

    .line 90
    .line 91
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    aput-object v4, v0, p0

    .line 96
    .line 97
    const/16 p0, 0xb

    .line 98
    .line 99
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    aput-object v4, v0, p0

    .line 104
    .line 105
    const/16 p0, 0xc

    .line 106
    .line 107
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    aput-object v4, v0, p0

    .line 112
    .line 113
    const/16 p0, 0xd

    .line 114
    .line 115
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    aput-object v4, v0, p0

    .line 120
    .line 121
    const/16 p0, 0xe

    .line 122
    .line 123
    invoke-static {v1}, Lhj8;->x(Lzr3;)Lzr3;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    aput-object v1, v0, p0

    .line 128
    .line 129
    const/16 p0, 0xf

    .line 130
    .line 131
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    aput-object v1, v0, p0

    .line 136
    .line 137
    const/16 p0, 0x10

    .line 138
    .line 139
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    aput-object v1, v0, p0

    .line 144
    .line 145
    const/16 p0, 0x11

    .line 146
    .line 147
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    aput-object v1, v0, p0

    .line 152
    .line 153
    const/16 p0, 0x12

    .line 154
    .line 155
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    aput-object v1, v0, p0

    .line 160
    .line 161
    const/16 p0, 0x13

    .line 162
    .line 163
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    aput-object v1, v0, p0

    .line 168
    .line 169
    const/16 p0, 0x14

    .line 170
    .line 171
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    aput-object v1, v0, p0

    .line 176
    .line 177
    const/16 p0, 0x15

    .line 178
    .line 179
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    aput-object v1, v0, p0

    .line 184
    .line 185
    const/16 p0, 0x16

    .line 186
    .line 187
    invoke-static {v2}, Lhj8;->x(Lzr3;)Lzr3;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    aput-object v1, v0, p0

    .line 192
    .line 193
    sget-object p0, Lja0;->a:Lja0;

    .line 194
    .line 195
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const/16 v2, 0x17

    .line 200
    .line 201
    aput-object v1, v0, v2

    .line 202
    .line 203
    const/16 v1, 0x18

    .line 204
    .line 205
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    aput-object p0, v0, v1

    .line 210
    .line 211
    const/16 p0, 0x19

    .line 212
    .line 213
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    aput-object v1, v0, p0

    .line 218
    .line 219
    const/16 p0, 0x1a

    .line 220
    .line 221
    invoke-static {v3}, Lhj8;->x(Lzr3;)Lzr3;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    aput-object v1, v0, p0

    .line 226
    .line 227
    return-object v0
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 37

    .line 1
    sget-object v0, Lzu7;->descriptor:Lll6;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, Lok1;->c(Lll6;)Lgy0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Lio/github/jan/supabase/auth/user/UserInfo;->access$get$childSerializers$cp()[Lnz3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object/from16 v18, v2

    .line 14
    .line 15
    const/16 p0, 0x0

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x0

    .line 30
    const/4 v15, 0x0

    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    const/16 v19, 0x1

    .line 34
    .line 35
    const/16 v20, 0x0

    .line 36
    .line 37
    const/16 v21, 0x0

    .line 38
    .line 39
    const/16 v22, 0x0

    .line 40
    .line 41
    const/16 v23, 0x0

    .line 42
    .line 43
    const/16 v24, 0x0

    .line 44
    .line 45
    const/16 v25, 0x0

    .line 46
    .line 47
    const/16 v26, 0x0

    .line 48
    .line 49
    const/16 v27, 0x0

    .line 50
    .line 51
    const/16 v28, 0x0

    .line 52
    .line 53
    const/16 v29, 0x0

    .line 54
    .line 55
    const/16 v30, 0x0

    .line 56
    .line 57
    const/16 v31, 0x0

    .line 58
    .line 59
    const/16 v32, 0x0

    .line 60
    .line 61
    :goto_0
    if-eqz v19, :cond_0

    .line 62
    .line 63
    invoke-interface {v1, v0}, Lgy0;->h(Lll6;)I

    .line 64
    .line 65
    .line 66
    move-result v33

    .line 67
    packed-switch v33, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    invoke-static/range {v33 .. v33}, Lh;->e(I)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    move/from16 v33, v8

    .line 75
    .line 76
    const/16 v8, 0x1a

    .line 77
    .line 78
    move-object/from16 v34, v10

    .line 79
    .line 80
    sget-object v10, Lwd3;->a:Lwd3;

    .line 81
    .line 82
    invoke-interface {v1, v0, v8, v10, v6}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Lqd3;

    .line 87
    .line 88
    const/high16 v8, 0x4000000

    .line 89
    .line 90
    :goto_1
    or-int v8, v33, v8

    .line 91
    .line 92
    move-object/from16 v10, v34

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_1
    move/from16 v33, v8

    .line 96
    .line 97
    move-object/from16 v34, v10

    .line 98
    .line 99
    const/16 v8, 0x19

    .line 100
    .line 101
    sget-object v10, Lwd3;->a:Lwd3;

    .line 102
    .line 103
    invoke-interface {v1, v0, v8, v10, v2}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lqd3;

    .line 108
    .line 109
    const/high16 v8, 0x2000000

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_2
    move/from16 v33, v8

    .line 113
    .line 114
    move-object/from16 v34, v10

    .line 115
    .line 116
    const/16 v8, 0x18

    .line 117
    .line 118
    sget-object v10, Lja0;->a:Lja0;

    .line 119
    .line 120
    invoke-interface {v1, v0, v8, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/lang/Boolean;

    .line 125
    .line 126
    const/high16 v8, 0x1000000

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_3
    move/from16 v33, v8

    .line 130
    .line 131
    move-object/from16 v34, v10

    .line 132
    .line 133
    const/16 v8, 0x17

    .line 134
    .line 135
    sget-object v10, Lja0;->a:Lja0;

    .line 136
    .line 137
    invoke-interface {v1, v0, v8, v10, v4}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ljava/lang/Boolean;

    .line 142
    .line 143
    const/high16 v8, 0x800000

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :pswitch_4
    move/from16 v33, v8

    .line 147
    .line 148
    move-object/from16 v34, v10

    .line 149
    .line 150
    const/16 v8, 0x16

    .line 151
    .line 152
    sget-object v10, Lt47;->a:Lt47;

    .line 153
    .line 154
    invoke-interface {v1, v0, v8, v10, v5}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Ljava/lang/String;

    .line 159
    .line 160
    const/high16 v8, 0x400000

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_5
    move/from16 v33, v8

    .line 164
    .line 165
    move-object/from16 v34, v10

    .line 166
    .line 167
    const/16 v8, 0x15

    .line 168
    .line 169
    sget-object v10, Lwd3;->a:Lwd3;

    .line 170
    .line 171
    invoke-interface {v1, v0, v8, v10, v7}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    check-cast v7, Lqd3;

    .line 176
    .line 177
    const/high16 v8, 0x200000

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :pswitch_6
    move/from16 v33, v8

    .line 181
    .line 182
    move-object/from16 v34, v10

    .line 183
    .line 184
    const/16 v8, 0x14

    .line 185
    .line 186
    sget-object v10, Lwd3;->a:Lwd3;

    .line 187
    .line 188
    invoke-interface {v1, v0, v8, v10, v15}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    move-object v15, v8

    .line 193
    check-cast v15, Lqd3;

    .line 194
    .line 195
    const/high16 v8, 0x100000

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :pswitch_7
    move/from16 v33, v8

    .line 199
    .line 200
    move-object/from16 v34, v10

    .line 201
    .line 202
    const/16 v8, 0x13

    .line 203
    .line 204
    sget-object v10, Lwd3;->a:Lwd3;

    .line 205
    .line 206
    invoke-interface {v1, v0, v8, v10, v14}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    move-object v14, v8

    .line 211
    check-cast v14, Lqd3;

    .line 212
    .line 213
    const/high16 v8, 0x80000

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :pswitch_8
    move/from16 v33, v8

    .line 217
    .line 218
    move-object/from16 v34, v10

    .line 219
    .line 220
    const/16 v8, 0x12

    .line 221
    .line 222
    sget-object v10, Lt47;->a:Lt47;

    .line 223
    .line 224
    invoke-interface {v1, v0, v8, v10, v13}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    move-object v13, v8

    .line 229
    check-cast v13, Ljava/lang/String;

    .line 230
    .line 231
    const/high16 v8, 0x40000

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :pswitch_9
    move/from16 v33, v8

    .line 236
    .line 237
    move-object/from16 v34, v10

    .line 238
    .line 239
    const/16 v8, 0x11

    .line 240
    .line 241
    sget-object v10, Lwd3;->a:Lwd3;

    .line 242
    .line 243
    invoke-interface {v1, v0, v8, v10, v12}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    move-object v12, v8

    .line 248
    check-cast v12, Lqd3;

    .line 249
    .line 250
    const/high16 v8, 0x20000

    .line 251
    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :pswitch_a
    move/from16 v33, v8

    .line 255
    .line 256
    move-object/from16 v34, v10

    .line 257
    .line 258
    sget-object v8, Lt47;->a:Lt47;

    .line 259
    .line 260
    const/16 v10, 0x10

    .line 261
    .line 262
    invoke-interface {v1, v0, v10, v8, v11}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    move-object v11, v8

    .line 267
    check-cast v11, Ljava/lang/String;

    .line 268
    .line 269
    const/high16 v8, 0x10000

    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :pswitch_b
    move/from16 v33, v8

    .line 274
    .line 275
    move-object/from16 v34, v10

    .line 276
    .line 277
    const/16 v8, 0xf

    .line 278
    .line 279
    sget-object v10, Lwd3;->a:Lwd3;

    .line 280
    .line 281
    invoke-interface {v1, v0, v8, v10, v9}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    move-object v9, v8

    .line 286
    check-cast v9, Lqd3;

    .line 287
    .line 288
    const v8, 0x8000

    .line 289
    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :pswitch_c
    move/from16 v33, v8

    .line 294
    .line 295
    move-object/from16 v34, v10

    .line 296
    .line 297
    const/16 v8, 0xe

    .line 298
    .line 299
    sget-object v10, Lxm3;->a:Lxm3;

    .line 300
    .line 301
    move-object/from16 v35, v2

    .line 302
    .line 303
    move-object/from16 v2, v34

    .line 304
    .line 305
    invoke-interface {v1, v0, v8, v10, v2}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    move-object v10, v2

    .line 310
    check-cast v10, Lkotlinx/serialization/json/JsonObject;

    .line 311
    .line 312
    move/from16 v8, v33

    .line 313
    .line 314
    or-int/lit16 v8, v8, 0x4000

    .line 315
    .line 316
    :goto_2
    move-object/from16 v2, v35

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :pswitch_d
    move-object/from16 v35, v2

    .line 321
    .line 322
    move-object v2, v10

    .line 323
    const/16 v10, 0xd

    .line 324
    .line 325
    move-object/from16 v34, v2

    .line 326
    .line 327
    sget-object v2, Lwd3;->a:Lwd3;

    .line 328
    .line 329
    move-object/from16 v33, v3

    .line 330
    .line 331
    move-object/from16 v3, v32

    .line 332
    .line 333
    invoke-interface {v1, v0, v10, v2, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object/from16 v32, v2

    .line 338
    .line 339
    check-cast v32, Lqd3;

    .line 340
    .line 341
    or-int/lit16 v8, v8, 0x2000

    .line 342
    .line 343
    :goto_3
    move-object/from16 v3, v33

    .line 344
    .line 345
    move-object/from16 v10, v34

    .line 346
    .line 347
    goto :goto_2

    .line 348
    :pswitch_e
    move-object/from16 v35, v2

    .line 349
    .line 350
    move-object/from16 v33, v3

    .line 351
    .line 352
    move-object/from16 v34, v10

    .line 353
    .line 354
    move-object/from16 v3, v32

    .line 355
    .line 356
    const/16 v2, 0xc

    .line 357
    .line 358
    sget-object v10, Lt47;->a:Lt47;

    .line 359
    .line 360
    move-object/from16 v3, v31

    .line 361
    .line 362
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    move-object/from16 v31, v2

    .line 367
    .line 368
    check-cast v31, Ljava/lang/String;

    .line 369
    .line 370
    or-int/lit16 v8, v8, 0x1000

    .line 371
    .line 372
    goto :goto_3

    .line 373
    :pswitch_f
    move-object/from16 v35, v2

    .line 374
    .line 375
    move-object/from16 v33, v3

    .line 376
    .line 377
    move-object/from16 v34, v10

    .line 378
    .line 379
    move-object/from16 v3, v31

    .line 380
    .line 381
    const/16 v2, 0xb

    .line 382
    .line 383
    sget-object v10, Lt47;->a:Lt47;

    .line 384
    .line 385
    move-object/from16 v3, v30

    .line 386
    .line 387
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    move-object/from16 v30, v2

    .line 392
    .line 393
    check-cast v30, Ljava/lang/String;

    .line 394
    .line 395
    or-int/lit16 v8, v8, 0x800

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :pswitch_10
    move-object/from16 v35, v2

    .line 399
    .line 400
    move-object/from16 v33, v3

    .line 401
    .line 402
    move-object/from16 v34, v10

    .line 403
    .line 404
    move-object/from16 v3, v30

    .line 405
    .line 406
    const/16 v2, 0xa

    .line 407
    .line 408
    sget-object v10, Lwd3;->a:Lwd3;

    .line 409
    .line 410
    move-object/from16 v3, v29

    .line 411
    .line 412
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    move-object/from16 v29, v2

    .line 417
    .line 418
    check-cast v29, Lqd3;

    .line 419
    .line 420
    or-int/lit16 v8, v8, 0x400

    .line 421
    .line 422
    goto :goto_3

    .line 423
    :pswitch_11
    move-object/from16 v35, v2

    .line 424
    .line 425
    move-object/from16 v33, v3

    .line 426
    .line 427
    move-object/from16 v34, v10

    .line 428
    .line 429
    move-object/from16 v3, v29

    .line 430
    .line 431
    const/16 v2, 0x9

    .line 432
    .line 433
    aget-object v10, v18, v2

    .line 434
    .line 435
    invoke-interface {v10}, Lnz3;->getValue()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v10

    .line 439
    check-cast v10, Lzr3;

    .line 440
    .line 441
    move-object/from16 v3, v28

    .line 442
    .line 443
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move-object/from16 v28, v2

    .line 448
    .line 449
    check-cast v28, Ljava/util/List;

    .line 450
    .line 451
    or-int/lit16 v8, v8, 0x200

    .line 452
    .line 453
    goto :goto_3

    .line 454
    :pswitch_12
    move-object/from16 v35, v2

    .line 455
    .line 456
    move-object/from16 v33, v3

    .line 457
    .line 458
    move-object/from16 v34, v10

    .line 459
    .line 460
    move-object/from16 v3, v28

    .line 461
    .line 462
    const/16 v2, 0x8

    .line 463
    .line 464
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v17

    .line 468
    or-int/lit16 v8, v8, 0x100

    .line 469
    .line 470
    :goto_4
    move-object/from16 v3, v33

    .line 471
    .line 472
    goto/16 :goto_2

    .line 473
    .line 474
    :pswitch_13
    move-object/from16 v35, v2

    .line 475
    .line 476
    move-object/from16 v33, v3

    .line 477
    .line 478
    move-object/from16 v34, v10

    .line 479
    .line 480
    move-object/from16 v3, v28

    .line 481
    .line 482
    const/4 v2, 0x7

    .line 483
    aget-object v10, v18, v2

    .line 484
    .line 485
    invoke-interface {v10}, Lnz3;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    check-cast v10, Lzr3;

    .line 490
    .line 491
    move-object/from16 v3, v27

    .line 492
    .line 493
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    move-object/from16 v27, v2

    .line 498
    .line 499
    check-cast v27, Ljava/util/List;

    .line 500
    .line 501
    or-int/lit16 v8, v8, 0x80

    .line 502
    .line 503
    goto/16 :goto_3

    .line 504
    .line 505
    :pswitch_14
    move-object/from16 v35, v2

    .line 506
    .line 507
    move-object/from16 v33, v3

    .line 508
    .line 509
    move-object/from16 v34, v10

    .line 510
    .line 511
    move-object/from16 v3, v27

    .line 512
    .line 513
    const/4 v2, 0x6

    .line 514
    sget-object v10, Lwd3;->a:Lwd3;

    .line 515
    .line 516
    move-object/from16 v3, v26

    .line 517
    .line 518
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    move-object/from16 v26, v2

    .line 523
    .line 524
    check-cast v26, Lqd3;

    .line 525
    .line 526
    or-int/lit8 v8, v8, 0x40

    .line 527
    .line 528
    goto/16 :goto_3

    .line 529
    .line 530
    :pswitch_15
    move-object/from16 v35, v2

    .line 531
    .line 532
    move-object/from16 v33, v3

    .line 533
    .line 534
    move-object/from16 v34, v10

    .line 535
    .line 536
    move-object/from16 v3, v26

    .line 537
    .line 538
    const/4 v2, 0x5

    .line 539
    sget-object v10, Lt47;->a:Lt47;

    .line 540
    .line 541
    move-object/from16 v3, v25

    .line 542
    .line 543
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    move-object/from16 v25, v2

    .line 548
    .line 549
    check-cast v25, Ljava/lang/String;

    .line 550
    .line 551
    or-int/lit8 v8, v8, 0x20

    .line 552
    .line 553
    goto/16 :goto_3

    .line 554
    .line 555
    :pswitch_16
    move-object/from16 v35, v2

    .line 556
    .line 557
    move-object/from16 v33, v3

    .line 558
    .line 559
    move-object/from16 v34, v10

    .line 560
    .line 561
    move-object/from16 v3, v25

    .line 562
    .line 563
    sget-object v2, Lwd3;->a:Lwd3;

    .line 564
    .line 565
    const/4 v10, 0x4

    .line 566
    move-object/from16 v3, v24

    .line 567
    .line 568
    invoke-interface {v1, v0, v10, v2, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    move-object/from16 v24, v2

    .line 573
    .line 574
    check-cast v24, Lqd3;

    .line 575
    .line 576
    or-int/lit8 v8, v8, 0x10

    .line 577
    .line 578
    goto/16 :goto_3

    .line 579
    .line 580
    :pswitch_17
    move-object/from16 v35, v2

    .line 581
    .line 582
    move-object/from16 v33, v3

    .line 583
    .line 584
    move-object/from16 v34, v10

    .line 585
    .line 586
    move-object/from16 v3, v24

    .line 587
    .line 588
    const/4 v2, 0x3

    .line 589
    sget-object v10, Lwd3;->a:Lwd3;

    .line 590
    .line 591
    move-object/from16 v3, v23

    .line 592
    .line 593
    invoke-interface {v1, v0, v2, v10, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    move-object/from16 v23, v2

    .line 598
    .line 599
    check-cast v23, Lqd3;

    .line 600
    .line 601
    or-int/lit8 v8, v8, 0x8

    .line 602
    .line 603
    goto/16 :goto_3

    .line 604
    .line 605
    :pswitch_18
    move-object/from16 v35, v2

    .line 606
    .line 607
    move-object/from16 v33, v3

    .line 608
    .line 609
    move-object/from16 v34, v10

    .line 610
    .line 611
    move-object/from16 v3, v23

    .line 612
    .line 613
    sget-object v2, Lwd3;->a:Lwd3;

    .line 614
    .line 615
    const/4 v10, 0x2

    .line 616
    move-object/from16 v3, v22

    .line 617
    .line 618
    invoke-interface {v1, v0, v10, v2, v3}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    move-object/from16 v22, v2

    .line 623
    .line 624
    check-cast v22, Lqd3;

    .line 625
    .line 626
    or-int/lit8 v8, v8, 0x4

    .line 627
    .line 628
    goto/16 :goto_3

    .line 629
    .line 630
    :pswitch_19
    move-object/from16 v35, v2

    .line 631
    .line 632
    move-object/from16 v33, v3

    .line 633
    .line 634
    move-object/from16 v34, v10

    .line 635
    .line 636
    move-object/from16 v3, v22

    .line 637
    .line 638
    const/4 v2, 0x1

    .line 639
    invoke-interface {v1, v0, v2}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v20

    .line 643
    or-int/lit8 v8, v8, 0x2

    .line 644
    .line 645
    goto/16 :goto_4

    .line 646
    .line 647
    :pswitch_1a
    move-object/from16 v35, v2

    .line 648
    .line 649
    move-object/from16 v33, v3

    .line 650
    .line 651
    move-object/from16 v34, v10

    .line 652
    .line 653
    move-object/from16 v3, v22

    .line 654
    .line 655
    const/4 v2, 0x1

    .line 656
    sget-object v10, Lxm3;->a:Lxm3;

    .line 657
    .line 658
    move-object/from16 v2, v21

    .line 659
    .line 660
    move-object/from16 v21, v3

    .line 661
    .line 662
    const/4 v3, 0x0

    .line 663
    invoke-interface {v1, v0, v3, v10, v2}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    check-cast v2, Lkotlinx/serialization/json/JsonObject;

    .line 668
    .line 669
    or-int/lit8 v8, v8, 0x1

    .line 670
    .line 671
    move-object/from16 v22, v21

    .line 672
    .line 673
    move-object/from16 v3, v33

    .line 674
    .line 675
    move-object/from16 v10, v34

    .line 676
    .line 677
    :goto_5
    move-object/from16 v21, v2

    .line 678
    .line 679
    goto/16 :goto_2

    .line 680
    .line 681
    :pswitch_1b
    move-object/from16 v35, v2

    .line 682
    .line 683
    move-object/from16 v33, v3

    .line 684
    .line 685
    move-object/from16 v34, v10

    .line 686
    .line 687
    move-object/from16 v2, v21

    .line 688
    .line 689
    move-object/from16 v21, v22

    .line 690
    .line 691
    const/4 v3, 0x0

    .line 692
    move/from16 v19, v3

    .line 693
    .line 694
    move-object/from16 v3, v33

    .line 695
    .line 696
    goto :goto_5

    .line 697
    :cond_0
    move-object/from16 v35, v2

    .line 698
    .line 699
    move-object/from16 v33, v3

    .line 700
    .line 701
    move-object/from16 v34, v10

    .line 702
    .line 703
    move-object/from16 v2, v21

    .line 704
    .line 705
    move-object/from16 v21, v22

    .line 706
    .line 707
    invoke-interface {v1, v0}, Lgy0;->b(Lll6;)V

    .line 708
    .line 709
    .line 710
    move-object/from16 v3, v30

    .line 711
    .line 712
    move-object/from16 v30, v7

    .line 713
    .line 714
    new-instance v7, Lio/github/jan/supabase/auth/user/UserInfo;

    .line 715
    .line 716
    const/16 v36, 0x0

    .line 717
    .line 718
    move-object/from16 v10, v20

    .line 719
    .line 720
    move-object/from16 v16, v27

    .line 721
    .line 722
    move-object/from16 v18, v28

    .line 723
    .line 724
    move-object/from16 v19, v29

    .line 725
    .line 726
    move-object/from16 v22, v32

    .line 727
    .line 728
    move-object/from16 v20, v3

    .line 729
    .line 730
    move-object/from16 v32, v4

    .line 731
    .line 732
    move-object/from16 v27, v13

    .line 733
    .line 734
    move-object/from16 v28, v14

    .line 735
    .line 736
    move-object/from16 v29, v15

    .line 737
    .line 738
    move-object/from16 v13, v24

    .line 739
    .line 740
    move-object/from16 v14, v25

    .line 741
    .line 742
    move-object/from16 v15, v26

    .line 743
    .line 744
    move-object/from16 v24, v9

    .line 745
    .line 746
    move-object/from16 v25, v11

    .line 747
    .line 748
    move-object/from16 v26, v12

    .line 749
    .line 750
    move-object/from16 v11, v21

    .line 751
    .line 752
    move-object/from16 v12, v23

    .line 753
    .line 754
    move-object/from16 v21, v31

    .line 755
    .line 756
    move-object/from16 v23, v34

    .line 757
    .line 758
    move-object/from16 v34, v35

    .line 759
    .line 760
    move-object v9, v2

    .line 761
    move-object/from16 v31, v5

    .line 762
    .line 763
    move-object/from16 v35, v6

    .line 764
    .line 765
    invoke-direct/range {v7 .. v36}, Lio/github/jan/supabase/auth/user/UserInfo;-><init>(ILkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Lqd3;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lqd3;Ljava/lang/String;Ljava/lang/String;Lqd3;Lkotlinx/serialization/json/JsonObject;Lqd3;Ljava/lang/String;Lqd3;Ljava/lang/String;Lqd3;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lqd3;Lqd3;Lrl6;)V

    .line 766
    .line 767
    .line 768
    return-object v7

    .line 769
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lzu7;->descriptor:Lll6;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/github/jan/supabase/auth/user/UserInfo;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lzu7;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/user/UserInfo;->write$Self$auth_kt(Lio/github/jan/supabase/auth/user/UserInfo;Lhy0;Lll6;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
