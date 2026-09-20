.class public final synthetic Lj5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj5;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lj5;->w:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Lvs7;->a:Lvs7;

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lyb5;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, Lxf4;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p0, p1, Lxf4;->c:Lwf4;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lwf4;->g(I)Luf4;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, ""

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    iget-object p1, p1, Luf4;->a:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p1, v0

    .line 41
    :goto_0
    const/4 v1, 0x4

    .line 42
    invoke-virtual {p0, v1}, Lwf4;->g(I)Luf4;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Luf4;->a:Ljava/lang/String;

    .line 49
    .line 50
    :cond_1
    new-instance p0, Lyb5;

    .line 51
    .line 52
    invoke-direct {p0, p1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    check-cast p1, Ljava/lang/Character;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p0}, Ltf4;->B(C)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_2
    check-cast p1, Ljava/lang/Character;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {p0}, Ltf4;->D(C)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_3
    check-cast p1, Ljava/lang/Character;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ltf4;->B(C)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_4
    check-cast p1, Ly41;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object p0, p1, Ly41;->a:Ljx3;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_5
    check-cast p1, Lvr0;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p0, p1, Lvr0;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Lz41;

    .line 121
    .line 122
    iget-object v0, p0, Lz41;->b:Ljava/util/ArrayList;

    .line 123
    .line 124
    iget-object p0, p0, Lz41;->a:Ljava/util/Set;

    .line 125
    .line 126
    new-instance v2, Lb51;

    .line 127
    .line 128
    invoke-direct {v2, p1, v1, v0, p0}, Lb51;-><init>(Lvr0;Lf61;Ljava/util/List;Ljava/util/Set;)V

    .line 129
    .line 130
    .line 131
    sget-object v3, Ltd0;->O:Ltd0;

    .line 132
    .line 133
    invoke-virtual {p1, v3, v2}, Lvr0;->a(Lrr0;La97;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Lc51;

    .line 137
    .line 138
    invoke-direct {v2, p1, v1, v0, p0}, Lc51;-><init>(Lvr0;Lf61;Ljava/util/List;Ljava/util/Set;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lg22;->L:Lg22;

    .line 142
    .line 143
    invoke-virtual {p1, p0, v2}, Lvr0;->a(Lrr0;La97;)V

    .line 144
    .line 145
    .line 146
    return-object v4

    .line 147
    :pswitch_6
    check-cast p1, Lok6;

    .line 148
    .line 149
    invoke-static {p1, v2}, Lmk6;->f(Lok6;I)V

    .line 150
    .line 151
    .line 152
    return-object v4

    .line 153
    :pswitch_7
    check-cast p1, Lln7;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    check-cast p1, Lhd5;

    .line 159
    .line 160
    iput-boolean v3, p1, Lhd5;->L:Z

    .line 161
    .line 162
    invoke-static {p1}, Lg75;->D(Ldk6;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_8
    check-cast p1, Lok6;

    .line 169
    .line 170
    return-object v4

    .line 171
    :pswitch_9
    check-cast p1, Li53;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object p0, p1, Li53;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :pswitch_a
    check-cast p1, Lok6;

    .line 188
    .line 189
    invoke-static {p1, v3}, Lmk6;->f(Lok6;I)V

    .line 190
    .line 191
    .line 192
    return-object v4

    .line 193
    :pswitch_b
    check-cast p1, Lqy0;

    .line 194
    .line 195
    sget-object p0, Lye;->b:Lt37;

    .line 196
    .line 197
    invoke-interface {p1, p0}, Lqy0;->g0(Lhu5;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Landroid/content/Context;

    .line 202
    .line 203
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    const-string p1, "android.software.leanback"

    .line 208
    .line 209
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    if-nez p0, :cond_2

    .line 214
    .line 215
    sget-object p0, Lfc0;->a:Lec0;

    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    sget-object p0, Lec0;->c:Ldc0;

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_2
    sget-object p0, Lhc0;->b:Lgc0;

    .line 224
    .line 225
    :goto_1
    return-object p0

    .line 226
    :pswitch_c
    check-cast p1, Lwy3;

    .line 227
    .line 228
    invoke-virtual {p1}, Lwy3;->a()V

    .line 229
    .line 230
    .line 231
    return-object v4

    .line 232
    :pswitch_d
    check-cast p1, Lvr0;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    sget-object p0, Ld63;->x:Ld63;

    .line 238
    .line 239
    new-instance v2, Lca0;

    .line 240
    .line 241
    const/4 v5, 0x3

    .line 242
    invoke-direct {v2, v5, v1}, Lca0;-><init>(ILf61;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p0, v2}, Lvr0;->a(Lrr0;La97;)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Lhz2;->x:Lhz2;

    .line 249
    .line 250
    new-instance v2, Lda0;

    .line 251
    .line 252
    invoke-direct {v2, v0, v1, v3}, Lda0;-><init>(ILf61;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, p0, v2}, Lvr0;->a(Lrr0;La97;)V

    .line 256
    .line 257
    .line 258
    return-object v4

    .line 259
    :pswitch_e
    check-cast p1, Lbg7;

    .line 260
    .line 261
    sget p0, Lt60;->a:I

    .line 262
    .line 263
    return-object v4

    .line 264
    :pswitch_f
    check-cast p1, Lyc4;

    .line 265
    .line 266
    sget-object p0, Lmp7;->x:Lk23;

    .line 267
    .line 268
    invoke-virtual {p1}, Lyc4;->a()Ldy3;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-interface {v0}, Ldy3;->k()J

    .line 273
    .line 274
    .line 275
    move-result-wide v0

    .line 276
    const/16 v2, 0x20

    .line 277
    .line 278
    shr-long/2addr v0, v2

    .line 279
    long-to-int v0, v0

    .line 280
    int-to-float v0, v0

    .line 281
    invoke-virtual {p1, p0, v0}, Lyc4;->c(Lk23;F)V

    .line 282
    .line 283
    .line 284
    sget-object p0, Lmp7;->w:Lk23;

    .line 285
    .line 286
    const/4 v0, 0x0

    .line 287
    invoke-virtual {p1, p0, v0}, Lyc4;->c(Lk23;F)V

    .line 288
    .line 289
    .line 290
    return-object v4

    .line 291
    :pswitch_10
    check-cast p1, Lvy7;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    iget-object p0, p1, Lvy7;->a:Ljava/lang/String;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_11
    check-cast p1, Lmt;

    .line 300
    .line 301
    return-object p1

    .line 302
    :pswitch_12
    check-cast p1, Ljava/lang/CharSequence;

    .line 303
    .line 304
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0

    .line 316
    :pswitch_13
    check-cast p1, Lok6;

    .line 317
    .line 318
    invoke-static {p1}, Lmk6;->i(Lok6;)V

    .line 319
    .line 320
    .line 321
    return-object v4

    .line 322
    :pswitch_14
    check-cast p1, Lrl;

    .line 323
    .line 324
    instance-of p0, p1, Lnc5;

    .line 325
    .line 326
    xor-int/2addr p0, v2

    .line 327
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    return-object p0

    .line 332
    :pswitch_15
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 341
    .line 342
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    return-object p0

    .line 347
    :pswitch_17
    check-cast p1, Lwk5;

    .line 348
    .line 349
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 350
    .line 351
    return-object p0

    .line 352
    :pswitch_18
    check-cast p1, Ljava/lang/Float;

    .line 353
    .line 354
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    const/high16 p1, 0x40000000    # 2.0f

    .line 359
    .line 360
    div-float/2addr p0, p1

    .line 361
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    return-object p0

    .line 366
    :pswitch_19
    check-cast p1, Lnq0;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    sget-object p0, Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;->Companion:Lu25;

    .line 372
    .line 373
    invoke-virtual {p0}, Lu25;->serializer()Lzr3;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    const-string v0, "algorithm"

    .line 382
    .line 383
    const/16 v1, 0xc

    .line 384
    .line 385
    invoke-static {p1, v0, p0, v1}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 386
    .line 387
    .line 388
    sget-object p0, Lpl6;->l:Lpl6;

    .line 389
    .line 390
    new-array v0, v3, [Lll6;

    .line 391
    .line 392
    const-string v2, "Any"

    .line 393
    .line 394
    invoke-static {v2, p0, v0}, Lb85;->g(Ljava/lang/String;Ln85;[Lll6;)Lnl6;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    const-string v0, "parameters"

    .line 399
    .line 400
    invoke-static {p1, v0, p0, v1}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 401
    .line 402
    .line 403
    return-object v4

    .line 404
    :pswitch_1a
    check-cast p1, Landroid/content/Context;

    .line 405
    .line 406
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    instance-of p0, p1, Landroid/content/ContextWrapper;

    .line 410
    .line 411
    if-eqz p0, :cond_3

    .line 412
    .line 413
    check-cast p1, Landroid/content/ContextWrapper;

    .line 414
    .line 415
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    :cond_3
    return-object v1

    .line 420
    :pswitch_1b
    check-cast p1, Lku7;

    .line 421
    .line 422
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    sget-object p0, Ln51;->a:Lq51;

    .line 426
    .line 427
    iput-object p0, p1, Lku7;->a:Lq51;

    .line 428
    .line 429
    return-object v4

    .line 430
    :pswitch_1c
    check-cast p1, Lok6;

    .line 431
    .line 432
    sget-object p0, Ll5;->a:Lml4;

    .line 433
    .line 434
    return-object v4

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
    .line 436
    .line 437
.end method
