.class public final Ln52;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Ln52;


# instance fields
.field public final a:Lnm7;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ln52;

    .line 2
    .line 3
    new-instance v1, Lnm7;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/16 v7, 0x7f

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ln52;-><init>(Lnm7;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ln52;->b:Ln52;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>(Lnm7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln52;->a:Lnm7;

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
.method public final a(Ln52;)Ln52;
    .locals 8

    .line 1
    new-instance v0, Ln52;

    .line 2
    .line 3
    new-instance v1, Lnm7;

    .line 4
    .line 5
    iget-object p1, p1, Ln52;->a:Lnm7;

    .line 6
    .line 7
    iget-object v2, p1, Lnm7;->a:Lgb2;

    .line 8
    .line 9
    iget-object p0, p0, Ln52;->a:Lnm7;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lnm7;->a:Lgb2;

    .line 14
    .line 15
    :cond_0
    iget-object v3, p1, Lnm7;->b:Ldv6;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-object v3, p0, Lnm7;->b:Ldv6;

    .line 20
    .line 21
    :cond_1
    iget-object v4, p1, Lnm7;->c:Lcn0;

    .line 22
    .line 23
    if-nez v4, :cond_2

    .line 24
    .line 25
    iget-object v4, p0, Lnm7;->c:Lcn0;

    .line 26
    .line 27
    :cond_2
    iget-object v5, p1, Lnm7;->d:Lxf6;

    .line 28
    .line 29
    if-nez v5, :cond_3

    .line 30
    .line 31
    iget-object v5, p0, Lnm7;->d:Lxf6;

    .line 32
    .line 33
    :cond_3
    iget-object p0, p0, Lnm7;->f:Ljava/util/Map;

    .line 34
    .line 35
    iget-object p1, p1, Lnm7;->f:Ljava/util/Map;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lsf4;->X(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/16 v7, 0x20

    .line 42
    .line 43
    invoke-direct/range {v1 .. v7}, Lnm7;-><init>(Lgb2;Ldv6;Lcn0;Lxf6;Ljava/util/LinkedHashMap;I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Ln52;-><init>(Lnm7;)V

    .line 47
    .line 48
    .line 49
    return-object v0
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ln52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ln52;

    .line 6
    .line 7
    iget-object p1, p1, Ln52;->a:Lnm7;

    .line 8
    .line 9
    iget-object p0, p0, Ln52;->a:Lnm7;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lnm7;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ln52;->a:Lnm7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnm7;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Ln52;->b:Ln52;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ln52;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "EnterTransition.None"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Ln52;->a:Lnm7;

    .line 13
    .line 14
    iget-object v0, p0, Lnm7;->a:Lgb2;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lgb2;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v0, v1

    .line 25
    :goto_0
    iget-object v2, p0, Lnm7;->b:Ldv6;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2}, Ldv6;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v2, v1

    .line 35
    :goto_1
    iget-object v3, p0, Lnm7;->c:Lcn0;

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v3}, Lcn0;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    move-object v3, v1

    .line 45
    :goto_2
    iget-object p0, p0, Lnm7;->d:Lxf6;

    .line 46
    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0}, Lxf6;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :cond_4
    const-string p0, ",\nSlide - "

    .line 54
    .line 55
    const-string v4, ",\nShrink - "

    .line 56
    .line 57
    const-string v5, "EnterTransition: \nFade - "

    .line 58
    .line 59
    invoke-static {v5, v0, p0, v2, v4}, Lf21;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string v0, ",\nScale - "

    .line 64
    .line 65
    invoke-static {p0, v3, v0, v1}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
