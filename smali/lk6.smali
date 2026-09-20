.class public final Llk6;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# static fields
.field public static final A:Llk6;

.field public static final y:Llk6;

.field public static final z:Llk6;


# instance fields
.field public final synthetic x:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Llk6;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Llk6;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Llk6;->y:Llk6;

    .line 9
    .line 10
    new-instance v0, Llk6;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Llk6;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Llk6;->z:Llk6;

    .line 17
    .line 18
    new-instance v0, Llk6;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Llk6;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Llk6;->A:Llk6;

    .line 25
    .line 26
    return-void
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
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Llk6;->x:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Llk6;->x:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lfk6;

    .line 7
    .line 8
    check-cast p2, Lfk6;

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p1, p1, Lfk6;->d:Lak6;

    .line 16
    .line 17
    sget-object v0, Ljk6;->u:Lnk6;

    .line 18
    .line 19
    iget-object p1, p1, Lak6;->w:Ltp4;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    move-object p1, p0

    .line 28
    :cond_0
    check-cast p1, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object p2, p2, Lfk6;->d:Lak6;

    .line 35
    .line 36
    iget-object p2, p2, Lak6;->w:Ltp4;

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object p0, p2

    .line 46
    :goto_0
    check-cast p0, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_0
    if-nez p1, :cond_2

    .line 62
    .line 63
    move-object p1, p2

    .line 64
    :cond_2
    return-object p1

    .line 65
    :pswitch_1
    check-cast p1, Lh4;

    .line 66
    .line 67
    check-cast p2, Lh4;

    .line 68
    .line 69
    new-instance p0, Lh4;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    iget-object v0, p1, Lh4;->a:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    :cond_3
    iget-object v0, p2, Lh4;->a:Ljava/lang/String;

    .line 78
    .line 79
    :cond_4
    if-eqz p1, :cond_5

    .line 80
    .line 81
    iget-object p1, p1, Lh4;->b:Lds2;

    .line 82
    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    :cond_5
    iget-object p1, p2, Lh4;->b:Lds2;

    .line 86
    .line 87
    :cond_6
    invoke-direct {p0, v0, p1}, Lh4;-><init>(Ljava/lang/String;Lds2;)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method
