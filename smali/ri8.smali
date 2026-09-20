.class public final Lri8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# static fields
.field public static final b:Lri8;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lri8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lri8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lri8;->b:Lri8;

    .line 8
    .line 9
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lri8;->a:I

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
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget p0, p0, Lri8;->a:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, Landroidx/versionedparcelable/ParcelImpl;

    .line 11
    .line 12
    invoke-direct {p0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, Lcy4;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lcy4;->w:I

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p0, p1}, Lzl4;->a(II)Lzl4;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 55
    .line 56
    .line 57
    :goto_0
    if-ge v1, v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance p1, Lmi4;

    .line 80
    .line 81
    invoke-direct {p1, p0, v2}, Lmi4;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_3
    new-instance p0, Lmg4;

    .line 86
    .line 87
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 88
    .line 89
    .line 90
    const-class v0, Lmg4;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iput p1, p0, Lmg4;->w:I

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_4
    new-instance p0, Lv64;

    .line 110
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iput v0, p0, Lv64;->w:I

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iput v0, p0, Lv64;->x:I

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-ne p1, v3, :cond_1

    .line 131
    .line 132
    move v1, v3

    .line 133
    :cond_1
    iput-boolean v1, p0, Lv64;->y:Z

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance p0, Lbf3;

    .line 140
    .line 141
    const-class v0, Landroid/content/IntentSender;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast v0, Landroid/content/IntentSender;

    .line 155
    .line 156
    const-class v1, Landroid/content/Intent;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Landroid/content/Intent;

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    invoke-direct {p0, v0, v1, v2, p1}, Lbf3;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 177
    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_6
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-ge v0, p0, :cond_3

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    int-to-char v1, v0

    .line 195
    if-eq v1, v3, :cond_2

    .line 196
    .line 197
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_2
    invoke-static {p1, v0}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    goto :goto_1

    .line 206
    :cond_3
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 207
    .line 208
    .line 209
    new-instance p0, Lx93;

    .line 210
    .line 211
    invoke-direct {p0, v2}, Lx93;-><init>(Landroid/os/Bundle;)V

    .line 212
    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_7
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    move-object v1, v2

    .line 220
    move-object v4, v1

    .line 221
    move-object v5, v4

    .line 222
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-ge v6, p0, :cond_8

    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    int-to-char v7, v6

    .line 233
    if-eq v7, v3, :cond_7

    .line 234
    .line 235
    if-eq v7, v0, :cond_6

    .line 236
    .line 237
    const/4 v8, 0x3

    .line 238
    if-eq v7, v8, :cond_5

    .line 239
    .line 240
    const/4 v8, 0x4

    .line 241
    if-eq v7, v8, :cond_4

    .line 242
    .line 243
    invoke-static {p1, v6}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_4
    sget-object v5, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 248
    .line 249
    invoke-static {p1, v6, v5}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    check-cast v5, Landroid/os/ResultReceiver;

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_5
    invoke-static {p1, v6}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    goto :goto_2

    .line 261
    :cond_6
    invoke-static {p1, v6}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    goto :goto_2

    .line 266
    :cond_7
    sget-object v2, Lnb1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 267
    .line 268
    invoke-static {p1, v6, v2}, Lg75;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    goto :goto_2

    .line 273
    :cond_8
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 274
    .line 275
    .line 276
    new-instance p0, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 277
    .line 278
    invoke-direct {p0, v2, v1, v4, v5}, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 279
    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_8
    new-instance p0, Lvq2;

    .line 283
    .line 284
    invoke-direct {p0, p1}, Lvq2;-><init>(Landroid/os/Parcel;)V

    .line 285
    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_9
    new-instance p0, Lsq2;

    .line 289
    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 291
    .line 292
    .line 293
    iput-object v2, p0, Lsq2;->A:Ljava/lang/String;

    .line 294
    .line 295
    new-instance v0, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    iput-object v0, p0, Lsq2;->B:Ljava/util/ArrayList;

    .line 301
    .line 302
    new-instance v0, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 305
    .line 306
    .line 307
    iput-object v0, p0, Lsq2;->C:Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iput-object v0, p0, Lsq2;->w:Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iput-object v0, p0, Lsq2;->x:Ljava/util/ArrayList;

    .line 320
    .line 321
    sget-object v0, Lr30;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 322
    .line 323
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, [Lr30;

    .line 328
    .line 329
    iput-object v0, p0, Lsq2;->y:[Lr30;

    .line 330
    .line 331
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    iput v0, p0, Lsq2;->z:I

    .line 336
    .line 337
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    iput-object v0, p0, Lsq2;->A:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iput-object v0, p0, Lsq2;->B:Ljava/util/ArrayList;

    .line 348
    .line 349
    sget-object v0, Ls30;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 350
    .line 351
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iput-object v0, p0, Lsq2;->C:Ljava/util/ArrayList;

    .line 356
    .line 357
    sget-object v0, Lnq2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 358
    .line 359
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    iput-object p1, p0, Lsq2;->D:Ljava/util/ArrayList;

    .line 364
    .line 365
    return-object p0

    .line 366
    :pswitch_a
    new-instance p0, Lnq2;

    .line 367
    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iput-object v0, p0, Lnq2;->w:Ljava/lang/String;

    .line 376
    .line 377
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    iput p1, p0, Lnq2;->x:I

    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_b
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 385
    .line 386
    .line 387
    move-result p0

    .line 388
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-ge v0, p0, :cond_a

    .line 393
    .line 394
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    int-to-char v1, v0

    .line 399
    if-eq v1, v3, :cond_9

    .line 400
    .line 401
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 402
    .line 403
    .line 404
    goto :goto_3

    .line 405
    :cond_9
    invoke-static {p1, v0}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    goto :goto_3

    .line 410
    :cond_a
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 411
    .line 412
    .line 413
    new-instance p0, Ld92;

    .line 414
    .line 415
    invoke-direct {p0, v2}, Ld92;-><init>(Landroid/os/Bundle;)V

    .line 416
    .line 417
    .line 418
    return-object p0

    .line 419
    :pswitch_c
    new-instance p0, Lmm1;

    .line 420
    .line 421
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    invoke-direct {p0, p1}, Lmm1;-><init>(I)V

    .line 426
    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_d
    new-instance p0, Lbj1;

    .line 430
    .line 431
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 432
    .line 433
    .line 434
    move-result-wide v0

    .line 435
    invoke-direct {p0, v0, v1}, Lbj1;-><init>(J)V

    .line 436
    .line 437
    .line 438
    return-object p0

    .line 439
    :pswitch_e
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-ge v0, p0, :cond_c

    .line 448
    .line 449
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    int-to-char v1, v0

    .line 454
    if-eq v1, v3, :cond_b

    .line 455
    .line 456
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 457
    .line 458
    .line 459
    goto :goto_4

    .line 460
    :cond_b
    invoke-static {p1, v0}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    goto :goto_4

    .line 465
    :cond_c
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 466
    .line 467
    .line 468
    new-instance p0, Lbc1;

    .line 469
    .line 470
    invoke-direct {p0, v2}, Lbc1;-><init>(Landroid/os/Bundle;)V

    .line 471
    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_f
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    const-string v0, ""

    .line 479
    .line 480
    move-object v4, v0

    .line 481
    move-object v8, v4

    .line 482
    move-object v9, v8

    .line 483
    move-object v5, v2

    .line 484
    move-object v6, v5

    .line 485
    move-object v7, v6

    .line 486
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-ge v0, p0, :cond_d

    .line 491
    .line 492
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    int-to-char v1, v0

    .line 497
    packed-switch v1, :pswitch_data_1

    .line 498
    .line 499
    .line 500
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 501
    .line 502
    .line 503
    goto :goto_5

    .line 504
    :pswitch_10
    invoke-static {p1, v0}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    goto :goto_5

    .line 509
    :pswitch_11
    invoke-static {p1, v0}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    goto :goto_5

    .line 514
    :pswitch_12
    invoke-static {p1, v0}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    goto :goto_5

    .line 519
    :pswitch_13
    invoke-static {p1, v0}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    goto :goto_5

    .line 524
    :pswitch_14
    invoke-static {p1, v0}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    goto :goto_5

    .line 529
    :pswitch_15
    invoke-static {p1, v0}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    goto :goto_5

    .line 534
    :cond_d
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 535
    .line 536
    .line 537
    new-instance v3, Lnb1;

    .line 538
    .line 539
    invoke-direct/range {v3 .. v9}, Lnb1;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    return-object v3

    .line 543
    :pswitch_16
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 544
    .line 545
    .line 546
    move-result p0

    .line 547
    move-object v1, v2

    .line 548
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-ge v4, p0, :cond_10

    .line 553
    .line 554
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    int-to-char v5, v4

    .line 559
    if-eq v5, v3, :cond_f

    .line 560
    .line 561
    if-eq v5, v0, :cond_e

    .line 562
    .line 563
    invoke-static {p1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 564
    .line 565
    .line 566
    goto :goto_6

    .line 567
    :cond_e
    invoke-static {p1, v4}, Lg75;->p(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    goto :goto_6

    .line 572
    :cond_f
    invoke-static {p1, v4}, Lg75;->u(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    goto :goto_6

    .line 577
    :cond_10
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 578
    .line 579
    .line 580
    new-instance p0, Lbb1;

    .line 581
    .line 582
    invoke-direct {p0, v2, v1}, Lbb1;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 583
    .line 584
    .line 585
    return-object p0

    .line 586
    :pswitch_17
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 587
    .line 588
    .line 589
    move-result p0

    .line 590
    move-object v1, v2

    .line 591
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    if-ge v4, p0, :cond_13

    .line 596
    .line 597
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    int-to-char v5, v4

    .line 602
    if-eq v5, v3, :cond_12

    .line 603
    .line 604
    if-eq v5, v0, :cond_11

    .line 605
    .line 606
    invoke-static {p1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 607
    .line 608
    .line 609
    goto :goto_7

    .line 610
    :cond_11
    sget-object v1, Lbb1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 611
    .line 612
    invoke-static {p1, v4, v1}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, Lbb1;

    .line 617
    .line 618
    goto :goto_7

    .line 619
    :cond_12
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 620
    .line 621
    invoke-static {p1, v4, v2}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    check-cast v2, Landroid/app/PendingIntent;

    .line 626
    .line 627
    goto :goto_7

    .line 628
    :cond_13
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 629
    .line 630
    .line 631
    new-instance p0, Lza1;

    .line 632
    .line 633
    invoke-direct {p0, v2, v1}, Lza1;-><init>(Landroid/app/PendingIntent;Lbb1;)V

    .line 634
    .line 635
    .line 636
    return-object p0

    .line 637
    :pswitch_18
    new-instance p0, Lz81;

    .line 638
    .line 639
    invoke-direct {p0, p1}, Lz81;-><init>(Landroid/os/Parcel;)V

    .line 640
    .line 641
    .line 642
    return-object p0

    .line 643
    :pswitch_19
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 644
    .line 645
    .line 646
    move-result p0

    .line 647
    :goto_8
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-ge v0, p0, :cond_15

    .line 652
    .line 653
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    int-to-char v2, v0

    .line 658
    if-eq v2, v3, :cond_14

    .line 659
    .line 660
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 661
    .line 662
    .line 663
    goto :goto_8

    .line 664
    :cond_14
    invoke-static {p1, v0}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    goto :goto_8

    .line 669
    :cond_15
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 670
    .line 671
    .line 672
    new-instance p0, Ler0;

    .line 673
    .line 674
    invoke-direct {p0, v1}, Ler0;-><init>(Z)V

    .line 675
    .line 676
    .line 677
    return-object p0

    .line 678
    :pswitch_1a
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 679
    .line 680
    .line 681
    move-result p0

    .line 682
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-ge v0, p0, :cond_17

    .line 687
    .line 688
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    int-to-char v2, v0

    .line 693
    if-eq v2, v3, :cond_16

    .line 694
    .line 695
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 696
    .line 697
    .line 698
    goto :goto_9

    .line 699
    :cond_16
    invoke-static {p1, v0}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 700
    .line 701
    .line 702
    move-result v1

    .line 703
    goto :goto_9

    .line 704
    :cond_17
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 705
    .line 706
    .line 707
    new-instance p0, Ldr0;

    .line 708
    .line 709
    invoke-direct {p0, v1}, Ldr0;-><init>(Z)V

    .line 710
    .line 711
    .line 712
    return-object p0

    .line 713
    :pswitch_1b
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 714
    .line 715
    .line 716
    move-result p0

    .line 717
    :goto_a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-ge v0, p0, :cond_18

    .line 722
    .line 723
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 728
    .line 729
    .line 730
    goto :goto_a

    .line 731
    :cond_18
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 732
    .line 733
    .line 734
    new-instance p0, Lcr0;

    .line 735
    .line 736
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 737
    .line 738
    .line 739
    return-object p0

    .line 740
    :pswitch_1c
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 741
    .line 742
    .line 743
    move-result p0

    .line 744
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    if-ge v0, p0, :cond_1a

    .line 749
    .line 750
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    int-to-char v2, v0

    .line 755
    if-eq v2, v3, :cond_19

    .line 756
    .line 757
    invoke-static {p1, v0}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 758
    .line 759
    .line 760
    goto :goto_b

    .line 761
    :cond_19
    invoke-static {p1, v0}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    goto :goto_b

    .line 766
    :cond_1a
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 767
    .line 768
    .line 769
    new-instance p0, Lar0;

    .line 770
    .line 771
    invoke-direct {p0, v1}, Lar0;-><init>(Z)V

    .line 772
    .line 773
    .line 774
    return-object p0

    .line 775
    :pswitch_1d
    const-class p0, Lzl4;

    .line 776
    .line 777
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    move-object v2, v0

    .line 786
    check-cast v2, Lzl4;

    .line 787
    .line 788
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    move-object v3, v0

    .line 797
    check-cast v3, Lzl4;

    .line 798
    .line 799
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 800
    .line 801
    .line 802
    move-result-object p0

    .line 803
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 804
    .line 805
    .line 806
    move-result-object p0

    .line 807
    move-object v5, p0

    .line 808
    check-cast v5, Lzl4;

    .line 809
    .line 810
    const-class p0, Lbj1;

    .line 811
    .line 812
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    move-object v4, p0

    .line 821
    check-cast v4, Lbj1;

    .line 822
    .line 823
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 824
    .line 825
    .line 826
    move-result v6

    .line 827
    new-instance v1, Lsh0;

    .line 828
    .line 829
    invoke-direct/range {v1 .. v6}, Lsh0;-><init>(Lzl4;Lzl4;Lbj1;Lzl4;I)V

    .line 830
    .line 831
    .line 832
    return-object v1

    .line 833
    :pswitch_1e
    new-instance p0, Ls30;

    .line 834
    .line 835
    invoke-direct {p0, p1}, Ls30;-><init>(Landroid/os/Parcel;)V

    .line 836
    .line 837
    .line 838
    return-object p0

    .line 839
    :pswitch_1f
    new-instance p0, Lr30;

    .line 840
    .line 841
    invoke-direct {p0, p1}, Lr30;-><init>(Landroid/os/Parcel;)V

    .line 842
    .line 843
    .line 844
    return-object p0

    .line 845
    :pswitch_20
    new-instance p0, Ltp;

    .line 846
    .line 847
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 851
    .line 852
    .line 853
    move-result p1

    .line 854
    if-eqz p1, :cond_1b

    .line 855
    .line 856
    move v1, v3

    .line 857
    :cond_1b
    iput-boolean v1, p0, Ltp;->w:Z

    .line 858
    .line 859
    return-object p0

    .line 860
    :pswitch_21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    new-instance p0, Lq8;

    .line 864
    .line 865
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    if-nez v1, :cond_1c

    .line 874
    .line 875
    goto :goto_c

    .line 876
    :cond_1c
    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 877
    .line 878
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object p1

    .line 882
    move-object v2, p1

    .line 883
    check-cast v2, Landroid/content/Intent;

    .line 884
    .line 885
    :goto_c
    invoke-direct {p0, v2, v0}, Lq8;-><init>(Landroid/content/Intent;I)V

    .line 886
    .line 887
    .line 888
    return-object p0

    .line 889
    :pswitch_22
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 890
    .line 891
    .line 892
    move-result p0

    .line 893
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 894
    .line 895
    .line 896
    move-result v4

    .line 897
    const v5, -0xc2a5d3a

    .line 898
    .line 899
    .line 900
    if-ne v4, v5, :cond_20

    .line 901
    .line 902
    invoke-static {p1}, Lg75;->U(Landroid/os/Parcel;)I

    .line 903
    .line 904
    .line 905
    move-result p0

    .line 906
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 907
    .line 908
    .line 909
    move-result v4

    .line 910
    if-ge v4, p0, :cond_1f

    .line 911
    .line 912
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    int-to-char v5, v4

    .line 917
    if-eq v5, v3, :cond_1e

    .line 918
    .line 919
    if-eq v5, v0, :cond_1d

    .line 920
    .line 921
    invoke-static {p1, v4}, Lg75;->T(Landroid/os/Parcel;I)V

    .line 922
    .line 923
    .line 924
    goto :goto_d

    .line 925
    :cond_1d
    invoke-static {p1, v4}, Lg75;->J(Landroid/os/Parcel;I)Z

    .line 926
    .line 927
    .line 928
    move-result v1

    .line 929
    goto :goto_d

    .line 930
    :cond_1e
    sget-object v2, Ldv0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 931
    .line 932
    invoke-static {p1, v4, v2}, Lg75;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    check-cast v2, Ldv0;

    .line 937
    .line 938
    goto :goto_d

    .line 939
    :cond_1f
    invoke-static {p1, p0}, Lg75;->z(Landroid/os/Parcel;I)V

    .line 940
    .line 941
    .line 942
    new-instance p0, Lmn;

    .line 943
    .line 944
    invoke-direct {p0, v2, v1}, Lmn;-><init>(Ldv0;Z)V

    .line 945
    .line 946
    .line 947
    goto :goto_e

    .line 948
    :cond_20
    add-int/lit8 p0, p0, -0x4

    .line 949
    .line 950
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 951
    .line 952
    .line 953
    sget-object p0, Lmn;->z:Lmn;

    .line 954
    .line 955
    :goto_e
    return-object p0

    .line 956
    nop

    .line 957
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lri8;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcy4;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lzl4;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lmi4;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lmg4;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lv64;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lbf3;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lx93;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lvq2;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lsq2;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lnq2;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Ld92;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lmm1;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lbj1;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lbc1;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lnb1;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lbb1;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lza1;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lz81;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Ler0;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Ldr0;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcr0;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lar0;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lsh0;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Ls30;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lr30;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Ltp;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lq8;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lmn;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
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
.end method
