.class public final Laf;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Laf;->x:I

    iput-object p2, p0, Laf;->y:Ljava/lang/Object;

    iput-object p3, p0, Laf;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lmm7;Lsr2;I)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    iput p3, p0, Laf;->x:I

    .line 3
    .line 4
    iput-object p1, p0, Laf;->y:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Laf;->z:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Laf;->x:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object v4, p0, Laf;->z:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Laf;->y:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lqk0;

    .line 15
    .line 16
    check-cast p2, Lcx2;

    .line 17
    .line 18
    check-cast p0, Lxz4;

    .line 19
    .line 20
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 21
    .line 22
    invoke-virtual {v0}, Luy3;->K()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    iput-object p1, p0, Lxz4;->h0:Lqk0;

    .line 29
    .line 30
    iput-object p2, p0, Lxz4;->g0:Lcx2;

    .line 31
    .line 32
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lje;

    .line 37
    .line 38
    invoke-virtual {p1}, Lje;->getSnapshotObserver()Lr95;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lxz4;->m0:Ll76;

    .line 43
    .line 44
    sget-object p2, Lxc4;->A:Lxc4;

    .line 45
    .line 46
    check-cast v4, Lwz4;

    .line 47
    .line 48
    iget-object p1, p1, Lr95;->a:Lcy6;

    .line 49
    .line 50
    invoke-virtual {p1, p0, p2, v4}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, p0, Lxz4;->k0:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iput-boolean v2, p0, Lxz4;->k0:Z

    .line 57
    .line 58
    :goto_0
    return-object v3

    .line 59
    :pswitch_0
    check-cast p1, Lyt2;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    and-int/lit8 v0, p2, 0x3

    .line 68
    .line 69
    const/4 v5, 0x2

    .line 70
    if-eq v0, v5, :cond_1

    .line 71
    .line 72
    move v0, v2

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v0, v1

    .line 75
    :goto_1
    and-int/2addr p2, v2

    .line 76
    invoke-virtual {p1, p2, v0}, Lyt2;->V(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_7

    .line 81
    .line 82
    check-cast p0, Laz3;

    .line 83
    .line 84
    iget-object p0, p0, Laz3;->g:Led5;

    .line 85
    .line 86
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    check-cast v4, Lgs2;

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Lyt2;->h0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p2}, Lyt2;->h(Z)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p2, :cond_2

    .line 106
    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {v4, p1, p0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_2
    iget p2, p1, Lyt2;->l:I

    .line 116
    .line 117
    if-nez p2, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    const-string p2, "No nodes can be emitted before calling deactivateToEndGroup"

    .line 121
    .line 122
    invoke-static {p2}, Ley0;->a(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    iget-boolean p2, p1, Lyt2;->S:Z

    .line 126
    .line 127
    if-nez p2, :cond_5

    .line 128
    .line 129
    if-nez p0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p1}, Lyt2;->X()V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    iget-object p0, p1, Lyt2;->G:Lfv6;

    .line 136
    .line 137
    iget p2, p0, Lfv6;->g:I

    .line 138
    .line 139
    iget p0, p0, Lfv6;->h:I

    .line 140
    .line 141
    iget-object v0, p1, Lyt2;->M:Lby0;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lby0;->d(Z)V

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, Lby0;->b:Lbn0;

    .line 150
    .line 151
    iget-object v0, v0, Lbn0;->u:Lj75;

    .line 152
    .line 153
    sget-object v2, La65;->d:La65;

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Lj75;->s(Lvg2;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, p1, Lyt2;->s:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-static {v0, p2, p0}, Lb96;->d(Ljava/util/List;II)V

    .line 161
    .line 162
    .line 163
    iget-object p0, p1, Lyt2;->G:Lfv6;

    .line 164
    .line 165
    invoke-virtual {p0}, Lfv6;->t()V

    .line 166
    .line 167
    .line 168
    :cond_5
    :goto_3
    iget-boolean p0, p1, Lyt2;->y:Z

    .line 169
    .line 170
    if-eqz p0, :cond_6

    .line 171
    .line 172
    iget-object p0, p1, Lyt2;->G:Lfv6;

    .line 173
    .line 174
    iget p0, p0, Lfv6;->i:I

    .line 175
    .line 176
    iget p2, p1, Lyt2;->z:I

    .line 177
    .line 178
    if-ne p0, p2, :cond_6

    .line 179
    .line 180
    const/4 p0, -0x1

    .line 181
    iput p0, p1, Lyt2;->z:I

    .line 182
    .line 183
    iput-boolean v1, p1, Lyt2;->y:Z

    .line 184
    .line 185
    :cond_6
    invoke-virtual {p1, v1}, Lyt2;->r(Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_7
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 190
    .line 191
    .line 192
    :goto_4
    return-object v3

    .line 193
    :pswitch_1
    check-cast p1, Lyt2;

    .line 194
    .line 195
    check-cast p2, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 198
    .line 199
    .line 200
    check-cast p0, Lmm7;

    .line 201
    .line 202
    check-cast v4, Lsr2;

    .line 203
    .line 204
    invoke-static {v2}, Lb85;->v(I)I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    invoke-static {p0, v4, p1, p2}, Li52;->a(Lmm7;Lsr2;Lyt2;I)V

    .line 209
    .line 210
    .line 211
    return-object v3

    .line 212
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    check-cast p2, Lfk6;

    .line 219
    .line 220
    check-cast v4, Lbf;

    .line 221
    .line 222
    check-cast p0, Lgk6;

    .line 223
    .line 224
    iget-object p0, p0, Lgk6;->b:Lzo4;

    .line 225
    .line 226
    iget v0, p2, Lfk6;->f:I

    .line 227
    .line 228
    invoke-virtual {p0, v0}, Lzo4;->c(I)Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_8

    .line 233
    .line 234
    invoke-virtual {v4, p1, p2}, Lbf;->h(ILfk6;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4}, Lbf;->e()V

    .line 238
    .line 239
    .line 240
    :cond_8
    return-object v3

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
