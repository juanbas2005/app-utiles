.class public final Lwf;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lwf;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lwf;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final invoke(Luk5;Lf61;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lwf;->a:I

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x5

    .line 11
    const/4 v6, 0x0

    .line 12
    sget-object v7, Lp81;->w:Lp81;

    .line 13
    .line 14
    iget-object v0, v0, Lwf;->b:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object v8, Lvs7;->a:Lvs7;

    .line 17
    .line 18
    packed-switch v3, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v0, Lwd7;

    .line 22
    .line 23
    new-instance v3, Lgv;

    .line 24
    .line 25
    invoke-direct {v3, v1, v0, v6, v5}, Lgv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v2}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne v0, v7, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v8

    .line 36
    :goto_0
    if-ne v0, v7, :cond_1

    .line 37
    .line 38
    move-object v8, v0

    .line 39
    :cond_1
    return-object v8

    .line 40
    :pswitch_0
    check-cast v0, Lze7;

    .line 41
    .line 42
    iget-object v3, v0, Lze7;->A:Lzc9;

    .line 43
    .line 44
    iget-object v0, v0, Lze7;->z:Lxe7;

    .line 45
    .line 46
    new-instance v4, Lig;

    .line 47
    .line 48
    move-object v5, v1

    .line 49
    check-cast v5, Lh97;

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v5}, Lrc9;->O0(Lvo1;)Luy3;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iget-object v5, v5, Luy3;->V:Lg58;

    .line 59
    .line 60
    invoke-direct {v4, v5}, Lig;-><init>(Lg58;)V

    .line 61
    .line 62
    .line 63
    new-instance v5, Ll70;

    .line 64
    .line 65
    invoke-direct {v5, v4, v3, v0, v6}, Ll70;-><init>(Lig;Lzc9;Lwd7;Lf61;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v5, v2}, Lfd1;->s(Luk5;Lgs2;Lf61;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-ne v0, v7, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move-object v0, v8

    .line 76
    :goto_1
    if-ne v0, v7, :cond_3

    .line 77
    .line 78
    move-object v8, v0

    .line 79
    :cond_3
    return-object v8

    .line 80
    :pswitch_1
    new-instance v9, Lno6;

    .line 81
    .line 82
    move-object v11, v0

    .line 83
    check-cast v11, Ldd7;

    .line 84
    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/16 v17, 0x1c

    .line 88
    .line 89
    const/4 v10, 0x1

    .line 90
    const-class v12, Ldd7;

    .line 91
    .line 92
    const-string v13, "tryShowContextMenu"

    .line 93
    .line 94
    const-string v14, "tryShowContextMenu-k-4lQ0M(J)V"

    .line 95
    .line 96
    const/4 v15, 0x0

    .line 97
    invoke-direct/range {v9 .. v17}, Lno6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lvf;

    .line 101
    .line 102
    invoke-direct {v0, v9, v6, v4}, Lvf;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v0, v2}, Lfd1;->s(Luk5;Lgs2;Lf61;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v7, :cond_4

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move-object v0, v8

    .line 113
    :goto_2
    if-ne v0, v7, :cond_5

    .line 114
    .line 115
    move-object v8, v0

    .line 116
    :cond_5
    return-object v8

    .line 117
    :pswitch_2
    new-instance v3, Ll70;

    .line 118
    .line 119
    check-cast v0, Ld67;

    .line 120
    .line 121
    invoke-direct {v3, v0, v6, v4}, Ll70;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v3, v2}, Lfd1;->s(Luk5;Lgs2;Lf61;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v7, :cond_6

    .line 129
    .line 130
    move-object v8, v0

    .line 131
    :cond_6
    return-object v8

    .line 132
    :pswitch_3
    new-instance v3, Lvf;

    .line 133
    .line 134
    check-cast v0, Lj71;

    .line 135
    .line 136
    const/4 v4, 0x4

    .line 137
    invoke-direct {v3, v0, v6, v4}, Lvf;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 138
    .line 139
    .line 140
    move-object v0, v1

    .line 141
    check-cast v0, Lh97;

    .line 142
    .line 143
    invoke-virtual {v0, v3, v2}, Lh97;->V0(Lgs2;Lf61;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v0, v7, :cond_7

    .line 148
    .line 149
    move-object v8, v0

    .line 150
    :cond_7
    return-object v8

    .line 151
    :pswitch_4
    check-cast v0, Lsr2;

    .line 152
    .line 153
    new-instance v3, Lsn;

    .line 154
    .line 155
    invoke-direct {v3, v5, v0}, Lsn;-><init>(ILsr2;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v1, v3, v2}, Lsb7;->d(Luk5;Lvr2;Lf61;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-ne v0, v7, :cond_8

    .line 163
    .line 164
    move-object v8, v0

    .line 165
    :cond_8
    return-object v8

    .line 166
    :pswitch_5
    new-instance v3, Lju1;

    .line 167
    .line 168
    check-cast v0, Lob5;

    .line 169
    .line 170
    const/16 v4, 0x11

    .line 171
    .line 172
    invoke-direct {v3, v1, v0, v6, v4}, Lju1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {v3, v2}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v7, :cond_9

    .line 180
    .line 181
    move-object v8, v0

    .line 182
    :cond_9
    return-object v8

    .line 183
    :pswitch_6
    new-instance v3, Lvf;

    .line 184
    .line 185
    check-cast v0, Lm92;

    .line 186
    .line 187
    const/4 v4, 0x2

    .line 188
    invoke-direct {v3, v0, v6, v4}, Lvf;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v3, v2}, Lfd1;->s(Luk5;Lgs2;Lf61;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v7, :cond_a

    .line 196
    .line 197
    move-object v8, v0

    .line 198
    :cond_a
    return-object v8

    .line 199
    :pswitch_7
    check-cast v0, Lvr2;

    .line 200
    .line 201
    new-instance v3, Ll20;

    .line 202
    .line 203
    const/4 v4, 0x1

    .line 204
    invoke-direct {v3, v4, v0}, Ll20;-><init>(ILvr2;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v3, v2}, Lmy1;->e(Luk5;Lgs2;Lf61;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :pswitch_8
    new-instance v3, Lvf;

    .line 213
    .line 214
    check-cast v0, Lxf;

    .line 215
    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-direct {v3, v0, v6, v4}, Lvf;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 218
    .line 219
    .line 220
    invoke-static {v1, v3, v2}, Lfd1;->s(Luk5;Lgs2;Lf61;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-ne v0, v7, :cond_b

    .line 225
    .line 226
    move-object v8, v0

    .line 227
    :cond_b
    return-object v8

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
